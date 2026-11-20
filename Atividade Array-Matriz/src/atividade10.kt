fun main() {
    val notasAlunos = Array(3) { DoubleArray(2) }
    notasAlunos[0] = doubleArrayOf(8.0, 7.5) // Aluno 0
    notasAlunos[1] = doubleArrayOf(5.0, 6.5) // Aluno 1
    notasAlunos[2] = doubleArrayOf(9.0, 9.5) // Aluno 2

    var somaGeralTurma = 0.0
    var totalNotas = 0

    for (i in notasAlunos.indices) {
        var somaAluno = 0.0
        for (j in notasAlunos[i].indices) {
            somaAluno += notasAlunos[i][j]
            somaGeralTurma += notasAlunos[i][j]
            totalNotas++
        }
        val mediaAluno = somaAluno / notasAlunos[i].size
        val status = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"

        println("Aluno $i -> Média: %.2f | Status: $status".format(mediaAluno))
    }

    val mediaGeral = somaGeralTurma / totalNotas
    println("\nMédia Geral da Turma: %.2f".format(mediaGeral))
}
