public class Scrabble {

    public int calculateScore(String word) {
        if (word == null || word.isEmpty()) {
            throw new IllegalArgumentException("Word cannot be null or empty");
        }
        
        int score = 0;
        for (char letter : word.toUpperCase().toCharArray()) {
            switch (letter) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> score += 1;
                case 'D', 'G' -> score += 2;
                case 'B', 'C', 'M', 'P' -> score += 3;
                case 'F', 'H', 'V', 'W', 'Y' -> score += 4;
                case 'K' -> score += 5;
                case 'J', 'X' -> score += 8;
                case 'Q', 'Z' -> score += 10;
                default -> throw new IllegalArgumentException("Invalid character found in the word");
            }
        }
        return score;
    }
}
