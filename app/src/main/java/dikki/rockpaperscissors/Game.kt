package dikki.rockpaperscissors

import kotlin.random.Random

object Game {
    private val options = listOf("ROCK", "PAPER", "SCISSORS")

    fun pickRandomOption() : String = options[Random.nextInt(0,3 )]
}