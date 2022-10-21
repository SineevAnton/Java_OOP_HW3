package Geometry;

public class Line extends Properties {
    double x1, y1;
    double x2, y2;
    public int id = 2;

    public Line() {
        super(0, 0);
        System.out.println("Constructor of Line class.");
    }

    public void showId() {
        super.showId();
        System.out.println("id = " + id + ", super id = " + super.id);
    }
}
