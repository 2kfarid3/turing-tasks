package az.edu.turing.DesignPattern.decorator;

public class ThreeDShapeDecorator extends ShapeDecorator {
    public ThreeDShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        add3DEffect();
    }

    private void add3DEffect() {
        System.out.println("3D Effect added");
    }
}
