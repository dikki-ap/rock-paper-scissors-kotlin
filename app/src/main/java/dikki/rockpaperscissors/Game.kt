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

    // First one is pickRandomOption, so Computer will pick Random Option
    fun pickRandomOption() : String = options[Random.nextInt(0,3 )]

    // And then display the drawable depends from the Option
    fun pickOptionDrawable(option: String) : Int = optionDrawable[option]!!

    // When user clicks option it will be does the same, and then check if it's win or not
    fun isWin(from: String, to: String) : Boolean = rules["$from-$to"]!!

    // Or maybe "draw"
    fun isDraw(from: String, to: String) : Boolean = from == to
}