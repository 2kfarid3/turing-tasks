package az.edu.turing.DesignPattern.withoutDecorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedCircle();
        Shape blueCircle = new BlueCircle();
        Shape shadowCircle = new ShadowCircle();
        Shape threeDCircle = new ThreeDCircle();

        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedRectangle();
        Shape blueRectangle = new BlueRectangle();
        Shape shadowRectangle = new ShadowRectangle();
        Shape threeDRectangle = new ThreeDRectangle();

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle with red border");
        redCircle.draw();

        System.out.println("\nCircle with blue border");
        blueCircle.draw();

        System.out.println("\nCircle with shadow");
        shadowCircle.draw();

        System.out.println("\nCircle with 3D effect");
        threeDCircle.draw();

        System.out.println("\nRectangle with normal border");
        rectangle.draw();

        System.out.println("\nRectangle with red border");
        redRectangle.draw();

        System.out.println("\nRectangle with blue border");
        blueRectangle.draw();

        System.out.println("\nRectangle with shadow");
        shadowRectangle.draw();

        System.out.println("\nRectangle with 3D effect");
        threeDRectangle.draw();
    }
}
