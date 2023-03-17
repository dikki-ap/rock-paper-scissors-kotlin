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
}