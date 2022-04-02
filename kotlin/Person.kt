open class Person(
    val name: String,
    val age: Int,
    val gender: String,
    var lastName: String
) {
    fun goToTheToilet() {
        println("$name пошел в $gender туалет")
    }

    fun newLastName(value: String) {
        lastName = value
    }
}