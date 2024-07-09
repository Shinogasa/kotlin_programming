const val MAX_EXPERIENCE: Int = 5000

fun main(args: Array<String>) {
    val playerName = "Estragon"
    var experiencePoints = 5
    experiencePoints += 5
    var hasSteed = false
    var pubName = "Unicorn's Horn"
    var pubOwner = "Gwendolyn"
    var money = 50
    var drinks = listOf("mead", "wine", "LaCroix")
    println(experiencePoints)
    println(playerName)
    println("Magic Mirror: ${playerName.reversed()}")
}