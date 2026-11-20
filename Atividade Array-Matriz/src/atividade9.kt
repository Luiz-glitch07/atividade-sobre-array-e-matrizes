fun main() {
    val matriz = arrayOf(
        intArrayOf(0, 5, 0),
        intArrayOf(10, 0, 2),
        intArrayOf(0, 8, 15)
    )
    var somaMaioresQueZero = 0

    for (linha in matriz) {
        for (valor in linha) {
            if (valor == 0) {
                continue // Pula os zeros
            }
            somaMaioresQueZero += valor
        }
    }

    println("Soma dos valores maiores que zero: $somaMaioresQueZero")
}
