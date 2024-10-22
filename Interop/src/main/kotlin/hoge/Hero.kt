@file:JvmName("Hero")

import org.example.Jhava

fun main(args: Array<String>) {
    val adversary = Jhava()

    adversary.greeting = "Hello, Hero."
    println(adversary.utterGreeting())

    val friendshipLevel = adversary.determineFriendshipLevel()
    println(friendshipLevel?.lowercase() ?: "It's complicated.")

    val adversaryHitPoints: Int = adversary.hitPoints
    println(adversaryHitPoints.dec())
    println(adversaryHitPoints.javaClass)

}

fun makeProclamation() = "Greetings, beast!"
