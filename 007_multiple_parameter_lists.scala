// package scala_step_by_step

object module {
  	
	val shift = 234
	val plainText = "the quick greyhat jumped over the lazy whitehat"

	def mapString(s : String)(f: Char => Char): String =
		s.map(f(_))

	val encrypt = (c: Char) => (c.toInt + shift).toChar		
	val decrypt = (c: Char) => (c.toInt - shift).toChar 

	def one() = {
		
		val cipherText = mapString(plainText){ c =>
			(c.toInt + shift).toChar
		}

		val recoveredPlainText = mapString(cipherText){ c =>
			(c.toInt - shift).toChar 
		}

		("function defined inline", cipherText, recoveredPlainText)
	}

	def two() = {
		
		val cipherText = mapString(plainText)(encrypt)

		val recoveredPlainText = mapString(cipherText)(decrypt)

		("function passed in", cipherText, recoveredPlainText)
	}

	def main(args: Array[String]): Unit = {  

		println("plainText: " + plainText) 

		Seq(one(), two()) map {
			case (method, cipherText, plainText) => {
				println("")
				println("method: " + method)
				println("cipher text: " + cipherText)
				println("recovered plaintext: " + plainText)
			}
		}

		Unit
	}
}