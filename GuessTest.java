import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GuessTest {

    @Test
    void testCorrectGuess() {
        assertEquals("Correct", Guess.guessCheck(50, 50));
    }

    @Test
    void testTooLow() {
        assertEquals("Too low", Guess.guessCheck(50, 25));
    }

    @Test
    void testTooHigh() {
        assertEquals("Too high", Guess.guessCheck(50, 75));
    }

    @Test
    void testOutOfRangeLow() {
        assertEquals("Out of range", Guess.guessCheck(50, 0));
    }

    @Test
    void testOutOfRangeHigh() {
        assertEquals("Out of range", Guess.guessCheck(50, 101));
    }

    @Test
    void testPlayAgainYes() {
        assertTrue(Guess.playAgainCheck("Y"));
        assertTrue(Guess.playAgainCheck("y"));
    }

    @Test
    void testPlayAgainNo() {
        assertFalse(Guess.playAgainCheck("N"));
        assertFalse(Guess.playAgainCheck("n"));
    }
}
