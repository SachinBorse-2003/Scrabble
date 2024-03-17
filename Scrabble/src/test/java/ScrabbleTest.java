import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScrabbleTest {

    @Test
    public void shouldCreateInstance() {
        Scrabble scrabble = new Scrabble();
       assertTrue(scrabble instanceof Scrabble);
    }
    @Test
    public void shouldThrowExceptionForEmptyWord() {
        Scrabble scrabble = new Scrabble();
        assertThrows(IllegalArgumentException.class, () -> {
            scrabble.calculateScore("");
        });
    }
}