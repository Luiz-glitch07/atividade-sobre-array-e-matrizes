fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    // Matriz 3x2 (3 linhas, 2 colunas)
    val transposta = Array(3) { IntArray(2) }

    for (i in original.indices) {
        for (j in original[i].indices) {
            transposta[j][i] = original[i][j]
        }
    }

    println("Matriz Original (2x3):")
    for (linha in original) println(linha.joinToString(" "))

    println("\nMatriz Transposta (3x2):")
    for (linha in transposta) println(linha.joinToString(" "))
}
