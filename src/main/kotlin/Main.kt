fun main() {
    // наследование

    val dog = Dog(10f)
    dog.eat()
    println(dog.habitat)

    println()

    // домашнее задание
    val employees = mutableListOf<Employee>()
    employees.add(Employee("Иван", 19))
    employees.add(Programmer("Сергей", 20, "java"))
    employees.add(Programmer("Василий", 25, "kotlin"))
    employees.add(Employee("Вячеслав", 27))

    for (employee in employees) {
        print("${employee.name}: ")
        employee.work()
    }
}