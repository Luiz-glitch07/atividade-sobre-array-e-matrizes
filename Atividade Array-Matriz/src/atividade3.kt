fun main() {
    val temperaturas = doubleArrayOf(28.5, 30.0, 27.2, 31.8, 29.0, 32.1, 26.5)
    var soma = 0.0

    for (temp in temperaturas) {
        soma += temp
    }
    val media = soma / temperaturas.size
    println("Média da semana: %.2f°C".format(media))

    println("Dias (índices) acima da média:")
    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Dia $i: ${temperaturas[i]}°C")
        }
    }
}
