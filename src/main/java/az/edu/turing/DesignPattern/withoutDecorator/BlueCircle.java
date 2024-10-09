package az.edu.turing.DesignPattern.withoutDecorator;

public class BlueCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        setBlueBorder();
    }

    private void setBlueBorder() {
        System.out.println("Border Color: Blue");
    }
}
