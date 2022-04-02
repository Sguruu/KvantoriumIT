class Electric(
    val rank: String,
    val protectiveSuit: Boolean,
    name: String,
    age: Int,
    gender: String,
    lastName: String
) : Person(name, age, gender, lastName) {
    fun conductElectricity() {
        println("Электрик $name ранга $rank проводит электричество")
    }
}


//class Electric(
//    val rank: Int,
//    /***
//     * @param Защитный костюм
//     */
//    val protectiveSuit: Boolean,
//    name: String,
//    age: Int,
//    gender: String,
//    lastName: String,
//) : Person(name, age, gender, lastName) {
//    /***
//     * Проводить электричество
//     */
//    fun conductElectricity() {
//        println("Электрик $name ранга $rank проводит электричество")
//    }
//}