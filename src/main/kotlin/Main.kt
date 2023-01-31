fun main() {

    val number = 3

    val numberString: String = when(number){
        1-> "Uno"
        2-> "Due"
        3-> "Tre"
        4-> "Quattro"
        5-> "Cinque"
        6-> "Sei"
        7-> "Sette"
        8-> "Otto"
        9-> "Nove"
        10-> "Dieci"
        !in 1..10 -> "Out of Range"
        else -> "Unknown"

    }
    println("The number $number translated into Italian is: $numberString")
}