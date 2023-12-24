@main def m(args: String*) = { //Usando os {} para definir espaço
    var i = 0

    while i < args.length do {

        if i != 0 then {
            print(" ") //o print vai imprimir tudo na mesma linha o println vai imprimir cada print em uma linha
        }
        print(args(i))

        i += 1
    }
}