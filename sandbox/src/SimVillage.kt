import kotlin.contracts.contract

fun main(args: Array<String>) {
    runSimulation()
}

fun runSimulation(): Unit {
    val greetingFunction = configureGreetingFunction()
    println(greetingFunction("Guyal"))
    println(greetingFunction("Guyal"))
}

fun configureGreetingFunction(): (String) -> String {
    val structureType = "hospital"
    var numBuildings = 5
    return { playerName: String ->
        val currentYear = 2021
        numBuildings += 1
        println("Adding $numBuildings $structureType buildings")
        "Welcome to $structureType, $playerName! (Current year: $currentYear)"
    }
}