object module {

	case class MinimalCaseClass()

	abstract class AbstractCaseClass
  
	case class CaseClassWithField(Name: String) extends AbstractCaseClass

	case class CaseClassWithTwoFields(Field1: String, Field2: String) extends AbstractCaseClass

	private def yo() : Unit = {

		val minimalCaseClass = MinimalCaseClass()

		val caseClassWithFieldNameFish = CaseClassWithField("fish")
		val anotherCaseClassWithFieldNameFish = CaseClassWithField("fish")

		val caseClassEqualityIsByStructure = caseClassWithFieldNameFish == anotherCaseClassWithFieldNameFish
		println(caseClassEqualityIsByStructure)

		val aleph = CaseClassWithTwoFields("aleph", "abjad") 
		val bethShallowCopy = aleph.copy(Field1 = "beth")

		println(aleph.Field1, aleph.Field2, bethShallowCopy.Field1, bethShallowCopy.Field2)
	}

	def main(args: Array[String]): Unit = {   
		
		yo()	
	}
}