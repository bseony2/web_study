package workshop07.shape;

public class Rectangle extends Shape implements Movable{

    private int width;

    public Rectangle(){}
    public Rectangle(int width, int x, int y){
        this.width = width;
        point = new Point(x, y);
    }

    @Override
    public void move(int x, int y) {
        point.setX(point.getX()+x+2);
        point.setY(point.getY()+y+2);
    }
    @Override
    public double getArea() {return width * width;}

    @Override
    public double getCircumference() {return 4 * width;}

    @Override
    public String printShapeInfo(){
        return "Rectangle \t" + width + "\t" +  point.getX() + "\t" + point.getY() + "\t" + getArea() + "\t" + getCircumference();
    }

    //getter & setter
    public int getRadius() {return this.width;}
    public void setRadius(int width) {this.width = width;}
    
}
