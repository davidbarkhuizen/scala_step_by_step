// p chiusano, r bjarnason: functional programming in scala, 2.5.1

object module {

	def map[A,B](sequence : Seq[A], f : A => B) : Seq[B] =  {

		@scala.annotation.tailrec
		def loop(n : Int, acc : Seq[B]) : Seq[B] =

			if (n == sequence.length) 		acc
			else 							loop(n + 1, acc :+ f(sequence(n)))

		loop(0, Seq())
	}

	private def test() : Boolean = {

		val sequence = Seq(1,2,3,4,5,6)
		val function  = (i : Int) => (i * 2)
		
		println(map(sequence, function))

		true
	}

	def main(args: Array[String]): Unit = {   

		val testResult = test()		
	}
}