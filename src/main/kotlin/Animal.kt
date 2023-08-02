open class Animal(val name: String, var weight: Float, val habitat: String) { // ключевое слово open разрешает наследование
    open fun eat() { // ключевое слово open, чтобы переопределить метод
        println("Кушаю")
    }

    fun run() {
        println("Бегу")
    }
}