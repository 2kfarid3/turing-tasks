package az.edu.turing.DesignPattern.withoutDecorator;

public class ThreeDCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        add3DEffect();
    }

    private void add3DEffect() {
        System.out.println("3D Effect added");
    }
}
