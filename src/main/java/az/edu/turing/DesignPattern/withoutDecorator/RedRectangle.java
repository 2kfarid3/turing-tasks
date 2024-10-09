package az.edu.turing.DesignPattern.withoutDecorator;

public class RedRectangle extends Rectangle {
    @Override
    public void draw() {
        super.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
