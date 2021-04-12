fun main() {

    println("Bem vinde ao ByteBank!")

    val contaLelus = Conta()
    contaLelus.titular = "Lelus"
    contaLelus.conta = 1001
    contaLelus.saldo = 200.00

    println("Titular: ${contaLelus.titular}")
    println("Conta: ${contaLelus.conta}")
    println("Saldo: ${contaLelus.saldo}")


    /*
    testaCopiasEReferencias()
    testaCondicoes(saldo)
    testaLoops()
     */
}

class Conta {
    var titular = ""
    var conta = 0
    var saldo = 0.00
}

fun testaCopiasEReferencias() {
    val numero = 10
    var numero2 = numero
    numero2++

    println("$numero, $numero2")

    val contaJoao = Conta()
    contaJoao.titular = "João"
    val contaMaria = Conta()
    contaMaria.titular = "Maria"

    println("${contaJoao.titular}, ${contaMaria.titular}")
}

fun testaCondicoes(saldo: Double) {
    /* if(saldo > 0.00) {
        println("Saldo: $saldo")
    } else if(saldo < 0.00) {
        println("Conta negativada.")
    } else {
        println("Conta zerada.")
    } */

    when {
        saldo > 0.00 -> println("Saldo: $saldo")
        saldo < 0.00 -> println("Conta negativada.")
        else -> println("Conta zerada.")
    }
}

fun testaLoops() {
    for(i in 1..5) {
        println(i)
    }

    println()

    for(i in 5 downTo 1) {
        println(i)
    }

    println()

    for(i in 1..5 step 2) {
        println(i)
    }

    println()

    for(i in 1..5) {
        if(i == 4) {
            break
        }

        println(i)
    }

    println()

    for(i in 5 downTo 1) {
        if(i == 4) {
            continue
        }

        println(i)
    }

    println()

    var i = 6

    while(i < 6) {
        println(i)
        i--
    }
}