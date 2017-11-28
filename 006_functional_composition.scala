object module {
  
	def one(): Unit = {

		val halfPiMinusR = (r: Double) => -r + math.Pi / 2

		val cos = halfPiMinusR andThen math.sin

		println(cos(2.3))
	}

	def two(): Unit = {
		
		def halfPiMinusR(r: Double): Double = 
			-r + math.Pi / 2

		val cos = halfPiMinusR _ andThen math.sin

		println(cos(2.3))
	}

	def main(args: Array[String]): Unit = {   
		one()
		two()
	}
}