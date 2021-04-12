fun main() {

    println("Bem vinde ao ByteBank!")



    val titular = "Lelus"
    val conta = 1001
    val agencia = 1
    var saldo = 0.00
    saldo += 200

    println("Agência: $agencia")
    println("Conta: $conta")

    /* testaCondicoes(saldo)
    testaLoops()
     */
}

class Conta {
    val titular = ""
    val conta = 0
    var saldo = 0.00
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