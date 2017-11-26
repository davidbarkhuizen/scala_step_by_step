// p chiusano, r bjarnason: functional programming in scala, 2.5.1

import scala.annotation.tailrec

object module {

	def monomorphicIndexOf(strings : Seq[String], item : String) : Option[Int] =  {

		@tailrec
		def loop(n : Int) : Option[Int] =

			if (n >= strings.length) 		None
			else if (strings(n) == item) 	Some(n)
			else 							loop(n + 1)

		loop(0)
	}

	def polymorphicIndexOf[A](items : Seq[A], item : A, predicate : A => Boolean) : Option[Int] =  {

		@tailrec
		def loop(n : Int) : Option[Int] =

			if (n >= items.length)			None
			else if (predicate(items(n)))	Some(n)
			else 							loop(n + 1)

		loop(0)
	}

	private def test() : Boolean = {

		val item1 = "i"
		val seq1 = Seq("a","b","c","d","e","f","g","h",item1)

		val oneMono = monomorphicIndexOf(seq1, item1) == Some(8)
		println(monomorphicIndexOf(seq1, item1))
		val onePoly = polymorphicIndexOf(seq1, item1, (x : String) => (x == item1)) == Some(8)
		println(polymorphicIndexOf(seq1, item1, (x : String) => (x == item1)))

		val item2 = 7
		val seq2 = Seq(0,1,2,3,4,5,6,item2)
		println(polymorphicIndexOf(seq2, item2, (x : Int) => (x == item2)))

		return true
	}

	def main(args: Array[String]): Unit = {   

		val testResult = test()		
	}
}