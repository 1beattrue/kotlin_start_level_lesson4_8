class Programmer(name: String, age: Int, private val programmingLanguage: String): Employee(name, age) {
    override fun work() {
        println("Пишу код на $programmingLanguage")
    }
}