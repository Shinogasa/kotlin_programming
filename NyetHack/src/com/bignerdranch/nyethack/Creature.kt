package com.bignerdranch.nyethack

interface Fightable {
    var healthPoints: Int
    val diceCount: Int
    val diceSides: Int
    val damageRoll: Int
        get() = (0 until diceCount).map {
            (1..diceSides).random()
        }.sum()

    fun attack(opponent: Fightable): Int
}

abstract class Monster(val name: String, val description: String, override var healthPoints: Int) : Fightable {
    override fun attack(opponent: Fightable): Int {
        val damageDeal = damageRoll
        opponent.healthPoints -= damageDeal
        return damageDeal
    }
}

class Goblin(
    name: String = "Goblin",
    description: String = "A nasty-looking goblin",
    healthPoints: Int = 30
) : Monster(name, description, healthPoints) {
    override val diceCount = 2
    override val diceSides = 8
}