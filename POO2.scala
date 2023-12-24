// POO

// Cria uma classe com construtor e métodos
class Alimento(nomeAlimento: String = "carne", pesoAlimento: Int = 1) {
  val nome: String = nomeAlimento
  var peso: Int = pesoAlimento

  def getPrice(precoUnitario: Int): Int = { //O Int do lado de fora é referente ao valor retornado de precoUnitario * peso
    precoUnitario * peso
  }
}

// Função main
def main(args: Array[String]) = {
      
    // Cria o objeto
    val peixe = new Alimento("salmon", 3)

    // Print
    println("O preço do alimento é: " + peixe.getPrice(25))

}


 



