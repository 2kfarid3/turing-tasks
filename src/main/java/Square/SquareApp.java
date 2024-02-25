package Square;

public class SquareApp {
    public static void main(String[] args) {
        Square square1 = new Square(2,"blue");
        double lengthSquare = square1.calcLength(square1.getSide());
        System.out.println(lengthSquare);
        System.out.println(square1.calcArea(square1.getSide()));
    }

}
