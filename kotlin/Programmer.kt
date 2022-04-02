class Programmer(
    val developmentEnvironment: String,
    val programmingLanguage: String,
    name: String,
    age: Int,
    gender: String,
    lastName: String,
    ):Person(name, age, gender, lastName) {

    fun development(){
        println("Программист $name разрабатывает на языке программирования $programmingLanguage " +
                "программу.")
    }

}