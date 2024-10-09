package az.edu.turing.DesignPattern.withoutDecorator;

public class ShadowCircle extends Circle {
    @Override
    public void draw() {
        super.draw();
        addShadow();
    }

    private void addShadow() {
        System.out.println("Shadow added");
    }
}
