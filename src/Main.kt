fun main() {

    //Instance of  constructor whit parameter
    val person = Person("Juan", "Perez", -20)
    println("name: ${person.name} \nlastName: ${person.lastName} \nage: ${person.age}")
    println()

    //Instance of empty constructor
    val person2 = Person()
    person2.name = "Armando"
    person2.lastName = "Choque"
    person2.age = 30
    println("name: ${person2.name} \nlastName:  ${person2.lastName} \nage: ${person2.age}")
    println()

    //Instance of data class
    val student = Student("Pepe", "Perez", 9.9)
    println(student)
    println()

    //Instance Objet Robot
    Robot.name = "Guido Leonel Miranda Aviza"
    Robot.dateInit()

}