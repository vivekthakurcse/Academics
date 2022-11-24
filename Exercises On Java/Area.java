import java.util.*;

public class Area {

    Area(int l, int b) {
        System.out.println("area of the rectangle = " + (l * b));
    }

    Area(double r) {
        System.out.println("area of the circle = " + (3.14 * r * r));
    }

    Area(int a, int b, int c) {
        double s = (double) (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("area of the triangle= " + area);
    }

    public static void main(String args[]) {
        Area a = new Area(2, 3);
        Area a1 = new Area(5.0);
        Area a2 = new Area(2, 3, 4);
    }
}
