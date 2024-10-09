package az.edu.turing.LambdaExpressions.Calculator;

import java.util.function.BiFunction;

public class Actions {
    public static BiFunction<Integer,Integer,Integer> add =
            Integer::sum;

    public static BiFunction<Double,Double,Double> addDouble =
            Double::sum;

    public static BiFunction<Integer,Integer,Integer> minus =
            (a, b) -> a - b;

    public static BiFunction<Double,Double,Double> minusDouble =
            (a, b) -> a - b;

    public static BiFunction<Integer,Integer,Integer> multiply =
            (a, b) -> a * b;

    public static BiFunction<Double,Double,Double> multiplyDouble =
            (a, b) -> a * b;

    public static BiFunction<Integer,Integer,Integer> division =
            (a, b) -> {
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero!");
                    return null;
                }
            };

    public static BiFunction<Double,Double,Double> divisionDouble =
            (a, b) -> {
                try {
                    return a / b;
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero!");
                    return null;
                }
            };
}

