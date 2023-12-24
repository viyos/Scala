// Manipulação de Arquivos

// Criação, Gravação e Leitura

import java.io.File
import java.io.FileWriter
import java.io.PrintWriter
import java.io.FileOutputStream
import java.io.BufferedWriter
import scala.util.Random

def main(args: Array[String]) = {

// Arquivo 1
val fileWriter = new FileWriter(new File("arquivo1.txt")) //Cria o arquivo e habilita ele para escrita
fileWriter.write("Manipulando arquivos em Scala") //Escreve o texto
fileWriter.close()

// Arquivo 2
val writer = new PrintWriter(new File("arquivo2.txt"))
val texto = "script"
val num = 4
writer.printf("Estamos executando um %s que manipula %d arquivos!", texto, new Integer(num)) //%s está guardando um espaço para a string texto e %d para a variavel num 
writer.close()

// Arquivo 3
val printWriter = new PrintWriter(new FileOutputStream(new File("arquivo3.txt"))) //FileOutputStream utilizado para grandes arquivos
val random = Random
for (i <- 1 to 10000) {
  printWriter.write(random.nextDouble().toString) //Pega o proximo objeto random nextDouble()
    printWriter.write("\n")
}
printWriter.close()

// Arquivo 4
val bufferedPrintWriter = new BufferedWriter(new PrintWriter(new File("arquivo4.txt")))
for (i <- 1 to 10000) {
  bufferedPrintWriter.write(random.nextDouble().toString)
}
bufferedPrintWriter.close()

// Leitura do arquivo 4
val fileName = "arquivo4.txt"
scala.io.Source.fromFile(fileName).getLines().foreach{ line => 
  println(line) 
}

}





