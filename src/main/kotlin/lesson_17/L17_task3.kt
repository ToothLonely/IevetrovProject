package org.example.lesson_17

class Folder(
    _name: String,
    _numberOfFiles: Int,
    private val isSecret: Boolean = false
) {
    val name: String = _name
        get() = if (isSecret) "Скрытая папка" else field
    val numberOfFiles = _numberOfFiles
        get() = if (isSecret) 0 else field

    fun showInfo() {
        println("Название папки: $name, количество файлов: $numberOfFiles")
    }
}

fun main() {
    val secretFolder = Folder("Folder1", 2, true)
    val simpleFolder = Folder("Folder2", 5)

    secretFolder.showInfo()
    simpleFolder.showInfo()
}