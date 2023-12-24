def main(args: Array[String]) = 

    //As listas não podem ser misturadas com tipos de variaveis diferentes (strings,int,...)
    //Cria uma lista de strings
    val nomes: List[String] = List("Victor","Ana","Jorge","Julia")

    val numeros: List[Int] = List(1,2,3,4)

    val nums = Nil //Lista vazia

    println("Tamanho da lista de nomes: "+ nomes.length)
    println("Primeiro elemento da lista: "+ nomes.head)
    println("Todos os elementos da lista, exceto o primeiro: "+ nomes.tail)
    println("A lista ao contrario: "+ nomes.reverse)
    println("Checa se a lista de nomes está vazia: " + nomes.isEmpty)
    println("Checa se a variavel esta vazia: "+ nums.isEmpty)
    println("Primeiro elemento da lista: "+ numeros(0))
    println("Soma dos numeros: "+ numeros.sum)
    println("Valor maximo da lista: "+ numeros.max)
    println("Valor minimo da lista: "+ numeros.min)