package Geometry;

public class Rectangle extends Properties {
    double x1, y1;
    double x2, y2;

    {
        x1 = 0;
        x2 = 1;
        y1 = 0;
        y2 = 1;
    }

    public Rectangle(){
        super(0,0);
        System.out.println("Default constructor of Rectangle class.");
    }

    public Rectangle(double x1, double x2, double y1, double y2){
        super(0,0);
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        System.out.println("Basic constructor of Rectangle class.");
    }

    public double getHeight(){
        return Math.abs(this.y1 - this.y2);
    }

    public double getWidth(){
        return Math.abs(this.x1 - this.x2);
    }

    @Override
    public double getArea(){
        return Math.round(getHeight() * getWidth());
    }

    public void showId() {
        super.showId();
        System.out.println("id = " + id + ", super id = " + super.id);
    }

    public void setColor(int color){
        this.color = color;
    }

    public void setWidth(int width){
        this.width = width;
    }
}
