package dikki.rockpaperscissors

import org.junit.Assert
import org.junit.Test

class GameTest {
    @Test
    // Testing for pickRandomOption
    fun testPickRandomOption() {
        val options = listOf("ROCK", "PAPER", "SCISSORS")
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
        Assert.assertTrue(options.contains(Game.pickRandomOption()))
    }

    @Test
    // Testing for pickOptionDrawable
    fun testPickDrawable() {
        Assert.assertEquals(R.drawable.rock, Game.pickOptionDrawable("ROCK"))
        Assert.assertEquals(R.drawable.paper, Game.pickOptionDrawable("PAPER"))
        Assert.assertEquals(R.drawable.scissors, Game.pickOptionDrawable("SCISSORS"))
    }

    @Test
    // Testing for isDraw
    fun testIsDraw() {
        Assert.assertTrue(Game.isDraw("ROCK", "ROCK"))
        Assert.assertTrue(Game.isDraw("PAPER", "PAPER"))
        Assert.assertTrue(Game.isDraw("SCISSORS", "SCISSORS"))

        Assert.assertFalse(Game.isDraw("ROCK", "PAPER"))
        Assert.assertFalse(Game.isDraw("PAPER", "SCISSORS"))
        Assert.assertFalse(Game.isDraw("SCISSORS", "ROCK"))
    }
}