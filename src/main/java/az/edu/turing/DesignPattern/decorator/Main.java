package az.edu.turing.DesignPattern.decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape blueCircle = new BlueShapeDecorator(new Circle());
        Shape shadowCircle = new ShadowShapeDecorator(new Circle());
        Shape threeDCircle = new ThreeDShapeDecorator(new Circle());
        Shape redAndBlueCircle = new RedShapeDecorator(new BlueShapeDecorator(new Circle()));


        Shape rectangle = new Rectangle();
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
        Shape shadowRectangle = new ShadowShapeDecorator(new Rectangle());
        Shape threeDRectangle = new ThreeDShapeDecorator(new Rectangle());

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

        System.out.println("\nCircle with red and blue border");
        redAndBlueCircle.draw();
    }
}
