package az.edu.turing.DesignPattern.decorator;

public class ShadowShapeDecorator extends ShapeDecorator {
    public ShadowShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        addShadow();
    }

    private void addShadow() {
        System.out.println("Shadow added");
    }
}
