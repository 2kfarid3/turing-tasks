package az.edu.turing.DesignPattern.withoutDecorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
