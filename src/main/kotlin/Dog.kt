class Dog(weight: Float) : Animal("Собака", weight, "Суша") { // теперь при создании собаки нужно инициализировать только поле weight
    override fun eat() {
        println("Кушаю кость")
    }
}