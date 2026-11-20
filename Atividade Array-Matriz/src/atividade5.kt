fun main() {
    val tarefas = arrayOf("Estudar Kotlin", "Fazer exercícios", "Subir código no GitHub", "Revisar matrizes")

    for ((indice, tarefa) in tarefas.withIndex()) {
        println("${indice + 1}. $tarefa")
    }
}
