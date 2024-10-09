package az.edu.turing.DesignPattern.withoutDecorator;

public class ShadowRectangle extends Rectangle {
    @Override
    public void draw() {
        super.draw();
        addShadow();
    }

    private void addShadow() {
        System.out.println("Shadow added");
    }
}
