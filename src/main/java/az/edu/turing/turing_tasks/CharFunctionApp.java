package az.edu.turing.turing_tasks;


public class CharFunctionApp {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C'};
        System.out.println(writeChar(array));
    }

    public static char[] writeChar(char[] arr) {
        char[] myDigits = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            myDigits[i] = arr[i];
        }
        return myDigits;
    }
}
