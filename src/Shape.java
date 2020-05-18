abstract class Shape implements Comparable<Shape>  {

    private Point position;
    private static int numShapes;
    private int id;

    public Shape(Point position){
        this.position=position;
        ++numShapes;
        setId(numShapes);
    }

    public Point getPosition() {
        return position;
    }
    public void setPosition(Point position) {
        this.position = position;
    }
    public static int getNumShapes(){
        return numShapes;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    abstract public double computeArea();
    abstract public double getPerimeter();

    public String toString(){
        return String.format("Shape type: %s, ID: %d, Area: %f, Perimeter: %f", getClass().getName(),id, computeArea(),getPerimeter());
    }

    @Override
    public int compareTo(final Shape o) {
        double x = Double.compare(this.computeArea(), o.computeArea());
        if (x == 0) {
            x = Double.compare(this.getPerimeter(), o.getPerimeter());
        }
        return (int) x;
    }
}