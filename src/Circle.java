import processing.core.PApplet;

public class Circle extends Shape {

    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    public double computeArea() {
        return Math.PI*Math.pow(radius,2);
    }

    public double getPerimeter() {
        return 2*Math.PI*radius;
    }

    public void draw(PApplet p){
        p.circle(
                (float) this.getPosition().getX(),
                (float) this.getPosition().getY(),
                (float) this.radius
        );
    }
}