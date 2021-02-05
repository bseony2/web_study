package workshop07.shape;

public abstract class Shape {
    protected Point point;
    
    public Shape(){}
    public Shape(Point point){
        this.point = point;
    }

    public abstract double getArea();
    public abstract double getCircumference();
    public abstract String printShapeInfo();


    public Point getPoint() {return this.point;}
    public void setPoint(Point point) {this.point = point;}
}
