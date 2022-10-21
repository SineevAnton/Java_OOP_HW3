import Geometry.*;

public class Main {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(5,10,5,15);
        System.out.println("Area of rect1 Rectangle is: "
                + rect1.getWidth() + " * " + rect1.getHeight() + " = " + rect1.getArea());

        Square sqr1 = new Square(5,10,5,10);
        System.out.println("Area of sqr1 Square is: "
                + sqr1.getWidth() + " * " + sqr1.getHeight() + " = " + sqr1.getArea());


        // Some code for Task 2
        System.out.println("\nOutput for Task_2");
        Foo foo = new Foo().arg1(15).arg2("Some text");
        System.out.println(foo._arg1);
        System.out.println(foo._arg2);
        System.out.println(foo._arg3);
        System.out.println(foo._arg4);
    }
}

