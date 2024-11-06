package az.edu.turing.string_properties;

public class FixingWord {
    public static String fixWord(String word) {
        StringBuilder result = new StringBuilder();
        char prevChar = ' ';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (Character.isDigit(currentChar)) {
                int count = Character.getNumericValue(currentChar);

                for (int j = 1; j < count; j++) {
                    result.append(prevChar);
                }
            } else {
                result.append(currentChar);
                prevChar = currentChar;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word = "Chan2el";
        String fixedWord = fixWord(word);
        System.out.println(fixedWord);
    }
}
