// POO

// Cria uma classe
class Alimento {
  val nome: String = "alcatra"
  var peso: Int = 1
}

//Cria uma classe
class Verdura(nomeverdura: String = "xuxu") {
  val nome: String = nomeverdura
}

// Função main
def main(args: Array[String]) = {
      
    // Cria o objeto
    val carne = new Alimento

    val vegetal = new Verdura("abobrinha") //Se tiver "abobrinha" a variavel continua com o mesmo nome dado na classe

    // Modifica o valor de um atributo do objeto
    carne.peso = 2

    // Print
    println("Peso do filé: " + carne.peso)
    println("Tipo da carne: " + carne.nome)
    println("Novo tipo de verdura: " + vegetal.nome)

}

  



