import java.util.*;

public class Rectangle {
    int l, b;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length : ");
        l = sc.nextInt();
        System.out.println("Enter breadth : ");
        b = sc.nextInt();
    }

    void printArea() {
        System.out.println("Area Of Rectangle : " + l * b);
    }

    void printPerimeter() {
        System.out.println("Area Of Rectangle : " + 2 * (l + b));
    }

    void printDiagonal() {
        double diagonal = Math.sqrt((l * l) + (b * b));
        System.out.println("Area Of Rectangle : " + diagonal);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.input();
        r.printArea();
        r.printPerimeter();
        r.printDiagonal();
    }
}
