fun main() {
    val numeros = IntArray(20) { it + 1 } // Cria [1, 2, ..., 20]
    var somaPares = 0

    for (i in 0 until numeros.size step 2) {
        somaPares += numeros[i]
    }

    println("Soma dos valores nos índices pares: $somaPares")
}
