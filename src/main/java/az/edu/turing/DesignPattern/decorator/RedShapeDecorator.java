package az.edu.turing.DesignPattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Border Color: Red");
    }
}
