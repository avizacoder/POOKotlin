data class Student (var curso: String, var lastName: String, var note: Double) {

    init {
        if (note < 10) {
            this.note = 0.0
        }
    }
}