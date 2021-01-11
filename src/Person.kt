class Person (var name: String, var lastName: String, var age: Int){

    //constructor empty
    constructor(): this("","",0)

    init {
        println("Value of the age: $age")
        if (age < 0){
            this.age = 0
        }
    }

}