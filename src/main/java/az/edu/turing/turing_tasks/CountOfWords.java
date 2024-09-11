package az.edu.turing.turing_tasks;

public class CountOfWords {
    public static void main(String[] args) {
        String myStr = "The quick brown fox jumps over the lazy dog.";
        String regex = "[,.\\s]";

        String[] myArray = myStr.split(regex);
        int count = 0;

        for (String s : myArray) {
            count += 1;
        }

        System.out.println(count);
    }
}
