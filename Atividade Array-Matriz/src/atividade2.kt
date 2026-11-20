fun main() {
    val codigos = arrayOf("TX100", "TX205", "TX310", "TX450", "TX999")
    val busca = "TX310"

    for (i in codigos.indices) {
        if (codigos[i] == busca) {
            println("Código $busca encontrado na posição (índice): $i")
            break
        }
    }
}
