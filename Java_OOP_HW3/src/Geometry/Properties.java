package Geometry;

public class Properties extends Geom {
    public int width, color;
    public int id = 1;

    /**
     * Default constructor of Property class
     */
    public Properties() {
        System.out.println("Constructor of Properties class.");
    }

    /**
     * Basic constructor of Property class
     * @param width value of figure line width
     * @param color value of figure line color
     */
    public Properties(int width, int color) {
        this.width = width;
        this.color = color;
        System.out.println("Constructor of Properties class (width and color).");
    }

    /**
     * Returns object's id
     */
    public void showId() {
        System.out.println("id = " + id);
    }

    /**
     * Empty method for overwriting in children's classes
     * @return -1.0 if doesnt overwriten
     */
    public double getArea() {
        return -1.0;
    }
}
