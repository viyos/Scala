// Tratamento de Exceções try catch finally

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

def main(args: Array[String]) = {
      try {
         val f = new FileReader("arquivo5.txt")
      } catch {
         case a: FileNotFoundException => {
            println("Arquivo não encontrado")
         }
         
         case b: IOException => {
            println("IO Exception")
         }
      } finally {
         println("Nada mais a fazer...")
      }
}