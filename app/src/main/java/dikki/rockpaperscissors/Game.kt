package dikki.rockpaperscissors

import kotlin.random.Random

object Game {
    private val options = listOf("ROCK", "PAPER", "SCISSORS")

    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to false,
        "SCISSORS-ROCK" to false,
        "SCISSORS-PAPER" to true
    )

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.rock,
        "PAPER" to R.drawable.paper,
        "SCISSORS" to R.drawable.scissors
    )

    fun pickRandomOption() : String = options[Random.nextInt(0,3 )]

    fun pickOptionDrawable(option: String) : Int = optionDrawable[option]!!

    fun isWin(from: String, to: String) : Boolean = rules["$from-$to"]!!

    fun isDraw(from: String, to: String) : Boolean = from == to
}