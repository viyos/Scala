// Manipulação de Arquivos

// Criação e Gravação de Arquivo

import java.io.File
import java.io.PrintWriter

def main(args: Array[String]) = {

   // Cria o arquivo
   val arquivo = new File("linguagens.txt" ) 
   
   // Passando a referência do arquivo
   val print_Writer = new PrintWriter(arquivo) //Permissão para escrever no arquivo
  
   // Gravando dados no arquivo    
   print_Writer.write("Scala, Python, R, Go, Java") 
   print_Writer.write("\nLinguagens")

   // Fecha o objeto 
   print_Writer.close()   


}





