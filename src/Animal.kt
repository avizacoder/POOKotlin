open class Animal(name: String, age: Int, colour: String) {
    var name: String = name
        set(value) {
            field = if (value.isNotEmpty()) {
                value
            } else {
                "Default"
            }
        }
    var age: Int = age
    set(value) {
        field = if (value < 0) {
            1
        }else {
            value
        }
    }

    var colour: String = colour

    constructor(): this("", 0, "")

    fun eat() {
        println("the $name is eating")
    }

    fun sleep() {
        println("the $name Sleeping")
    }



}