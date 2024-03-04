package az.edu.turing.Square;

public class Square {
    public static long countOfSquares;
    private String color;
    private double side;

    public Square(double side, String color){
        this.side = side;
        this.color = color;
        countOfSquares++;
    }

    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcLength(double side){
        return 4 * side;
    }

    public double calcArea(double side){
        return side * side;
    }
}
