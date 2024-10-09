package MenuApp;

public class Calculator {
    //Add method
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    //isPrime method
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    //Sqrt method
    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    //Factorial method
    public static long fact(long n) {
        long constant = 1;
        for (int i = 2; i <= n; i++) {
            constant *= i;
        }
        return constant;
    }
}
