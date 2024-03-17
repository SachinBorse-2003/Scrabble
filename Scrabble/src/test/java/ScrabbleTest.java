import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ScrabbleTest {

    @Test
    public void shouldCreateInstance() {
        Scrabble scrabble = new Scrabble();
        assertEquals(0, scrabble.calculateScore(""));
    }
    @Test
    public void shouldThrowExceptionForEmptyWord() {
        Scrabble scrabble = new Scrabble();
        assertThrows(IllegalArgumentException.class, () -> {
            scrabble.calculateScore("");
        });
    }
}