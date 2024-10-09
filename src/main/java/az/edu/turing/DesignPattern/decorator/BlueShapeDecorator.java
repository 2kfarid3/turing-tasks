package az.edu.turing.DesignPattern.decorator;

public class BlueShapeDecorator extends ShapeDecorator {
    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder();
    }

    private void setBlueBorder() {
        System.out.println("Border Color: Blue");
    }
}
