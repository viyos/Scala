@main def f(args: String*) = //O * junto da String singnifica que não tem um tamanho de string definido

    var i = 0

    while i < args.length do //Enquanto i for menor do que o tamanho do argumento/palavra ele faz o que é desejado
        println(args(i))
        i += 1
