package Geometry;

public class Square extends Rectangle{
    double x1, y1;
    double x2, y2;

    {
        x1 = 0;
        x2 = 1;
        y1 = 0;
        y2 = 1;
    }

    /**
     * Default constructor of Square class
     */
    public Square(){
        super();
        System.out.println("Default constructor of Square class.");
    }

    /**
     * Basic constructor of Square class.
     * @param x1 x coordinate of first point
     * @param x2 x coordinate of second point
     * @param y1 y coordinate of first point
     * @param y2 y coordinate of second point
     */
    public Square(double x1, double x2, double y1, double y2){
        super();
        super.x1 = x1;
        super.x2 = x2;
        super.y1 = y1;
        super.y2 = y2;
        System.out.println("Basic constructor of Square class.");
    }

    // Остальные методы (получение длин сторон и вычисление площади) не переписываем.
    // Будем использовать методы родительского класса.
}
