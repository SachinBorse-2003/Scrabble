public class Scrabble {

    public int calculateScore(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty");
        }
        return 0;
    }
}
