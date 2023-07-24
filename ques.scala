

object ques {
    def encryption(str: String, shift: Int): String = {
      val text = str.map { charactor =>
        if (charactor.isLetter) {
          val base = if (charactor.isUpper) 'A' else 'a'
          val offset = (charactor - base + shift) % 26
          (base + offset).toChar
        } else {
          charactor
        }
      } 
      text
    }

    def decryption(str: String, shift: Int): String = {
      encryption(str, 26 - shift)
    }

    def main(args: Array[String]): Unit = {
      println("Enter the text:")
      val text = scala.io.StdIn.readLine()

      println("Enter the shift value:")
      val shift = scala.io.StdIn.readInt()

      val encryptedText = encryption(text, shift)
      println(s"Encrypted text: $encryptedText")

      val decryptedText = decryption(encryptedText, shift)
      println(s"Decrypted text: $decryptedText")

    }

}