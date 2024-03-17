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
    @Test
public void shouldCalculateScoreForSingleLetter() {
    Scrabble scrabble = new Scrabble();
    assertEquals(1, scrabble.calculateScore("A"));
}
@Test
public void shouldCalculateScoreForWordWithMultipleLetters() {
    Scrabble scrabble = new Scrabble();
    assertEquals(8, scrabble.calculateScore("HELLO"));
}
@Test
public void shouldCalculateScoreForWordWithMixedCase() {
    Scrabble scrabble = new Scrabble();
    assertEquals(14, scrabble.calculateScore("ScrAbBle"));
}
@Test
public void shouldThrowExceptionForWordWithNonAlphabeticCharacters() {
    Scrabble scrabble = new Scrabble();
    assertThrows(IllegalArgumentException.class, () -> {
        scrabble.calculateScore("123");
    });
}
@Test
public void shouldThrowExceptionForWordWithSpecialCharacters() {
    Scrabble scrabble = new Scrabble();
    assertThrows(IllegalArgumentException.class, () -> {
        scrabble.calculateScore("!@#$%");
    });
}
}