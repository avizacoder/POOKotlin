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
    println("----------------------------------------------------------------------------------------")

    //use of get and set methods
    //Instance the class

    val dog = Dog()
    dog.name = "Texa"
    dog.age = 3
    dog.colour = "black"
    println("name ${dog.name}, age ${dog.age}, colour ${dog.colour} ")
    dog.eat()
    dog.sleep()
    dog.bark()


    println()

    val lion = Lion()
    lion.name = "BOM"
    lion.age = -12
    lion.colour = "marron"
    println("name ${lion.name}, age ${lion.age}, colour ${lion.colour} ")
    lion.eat()
    lion.sleep()
    lion.fast()

}