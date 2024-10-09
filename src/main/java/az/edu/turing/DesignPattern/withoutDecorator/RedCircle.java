package az.edu.turing.DesignPattern.withoutDecorator;

public class RedCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
