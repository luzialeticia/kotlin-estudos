fun main() {

    val titular = "Lelus"
    val conta = 1001
    val agencia = 1
    var saldo = 0.00
    saldo += 200

    println("Bem vinde ao ByteBank, $titular!")
    println("Agência: $agencia")
    println("Conta: $conta")
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