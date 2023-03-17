package dikki.rockpaperscissors

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    fun testPickRandomOption() {
        val options = listOf("ROCK", "PAPER", "SCISSORS")
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
    }
}