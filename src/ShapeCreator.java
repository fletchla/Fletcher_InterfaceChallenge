import processing.core.PApplet;
import java.util.ArrayList;

public class ShapeCreator extends PApplet {

    //you'll need a structure to hold many shapes
    Shape shape;
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    public void settings() {
        size(500,500);
    }

    public void setup() {
        //you'll need to create all the shapes that make up your picture
        shapes.add(new Circle(new Point(this.width/2 - 50, 200.0), 50.0));
        shapes.add(new Circle(new Point(this.width/2 + 50, 200.0), 50.0));
        shapes.add(new Rectangle(new Point(this.width/2, 300), 20.0, 20.0));
        //shape = new Circle(new Point(200.0, 200.0), 50.0);
    }

    public void draw() {
        //you'll need to draw all your shapes
        //this is your ShapeCreator object which is your sketch.
        //pass shape.draw the sketch so it can draw on it
        for(Shape shape: this.shapes){
            shape.draw(this);
        }

    }

}