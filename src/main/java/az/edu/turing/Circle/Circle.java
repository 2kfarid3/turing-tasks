package az.edu.turing.Circle;

public class Circle {
    public static long countOfCircles;
    private  double radius;
    private String color;

    public Circle(double radius){
        this.radius = radius;
        countOfCircles++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ("white".equals(color)){
            this.color = color;
        }
    }

    public double calcLength(){
        return 2 * Math.PI * radius;
    }
}
