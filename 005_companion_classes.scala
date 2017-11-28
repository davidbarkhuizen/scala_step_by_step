package scala_step_by_step


object singleton_object_module {
  
	private def yo(sequence : Seq[Char]) : Unit = {

		val str = sequence.foldLeft("")((s, c) => s + String.valueOf(c)) 
		println(str)
	}

	def main(args: Array[String]): Unit = {   
		
		val charSeq = Seq('e','n','t','r','y',' ','p','o','i','n','t')
		yo(charSeq)
	}
}