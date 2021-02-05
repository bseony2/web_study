package workshop07.shape;

public class Circle extends Shape implements Movable{

    private int radius;

    public Circle(){}
    public Circle(int radius, int x, int y){
        this.radius = radius;
        point = new Point(x, y);
    }

    @Override
    public void move(int x, int y) {
        point.setX(point.getX()+x+1);
        point.setY(point.getY()+y+1);
    }

    @Override
    public double getArea() {return 3.14*radius*radius;}

    @Override
    public double getCircumference() {return 2*3.14*radius;}

    @Override
    public String printShapeInfo(){
        return "Circle \t\t" + radius + "\t" +  point.getX() + "\t" + point.getY() + "\t" + getArea() + "\t" + getCircumference();
    }


    //getter & setter
    public int getRadius() {return this.radius;}
    public void setRadius(int radius) {this.radius = radius;}

    
    
}
