//Program to find the area and perimeter of different shapes
//Programmed by vivek thakur | vivek1kumar2thakur@gmail.com



import java.util.*;

public class AreaCalc {
	public static void main(String[] args) {
		System.out.print("\n                   Shapes Calculator               \n");
		System.out.print("\n ====================================================   \n");
		Scanner input = new Scanner(System.in);
		System.out.print("\n Choose among the following shapes name - \n");
		System.out.print(" \n 1 . Triangle\n ");
		System.out.print("2 . Rectangle\n ");
		System.out.print("3 . Square\n ");
		System.out.print("4 . Circle\n");
		System.out.print("\n ==================================================== \n  ");
		System.out.print("\n Enter your choice : ");
		int shapename = input.nextInt();
		System.out.print("\n ====================================================   \n");

		//Calculating area or perimeter of triangle

		if (shapename == 1) {
			double a, b, c, base, height ;
			System.out.print("\n              What you want to calculate ?\n");
			System.out.print("              1. Area or 2. Perimeter \n");
			System.out.print("              Enter : ");
			int choice = input.nextInt();
			System.out.print("\n ====================================================   ");

			if (choice == 1) {
				System.out.print("\n\n    Enter base of triangle = ");
				base = input.nextDouble();
				System.out.print("    Enter base of triangle = ");
				height = input.nextDouble();
				double area = (0.5) * base * height;
				System.out.print("    Area of triangle =" + area);

			} else if (choice == 2) {
				System.out.print("\n\n    Enter length  of first side of triangle = ");
				a = input.nextDouble();
				System.out.print("    Enter length of second side of  triangle = ");
				b = input.nextDouble();
				System.out.print("    Enter length  of third side of triangle = ");
				c = input.nextDouble();
				double perimeter_triangle = a + b + c ;
				System.out.print("    Perimeter of triangle = " + perimeter_triangle);
			}

		}

		//Calculating area or perimeter of rectangle

		else if (shapename == 2) {
			Scanner new_in = new Scanner(System.in);
			double d, e ;
			System.out.print("\n              What you want to calculate ?\n");
			System.out.print("              1. Area or 2. Perimeter  \n");
			System.out.print("              Enter : ");
			int choice = input.nextInt();
			System.out.print("\n ====================================================   ");
			if (choice == 1) {
				System.out.print("\n\n    Enter length of rectangle = ");
				d = new_in.nextDouble();
				System.out.print("    Enter breath of rectangle  = ");
				e = new_in.nextDouble();
				double area = d * e ;
				System.out.print("    Area of rectangle = " + area);

			} else if (choice == 2) {
				System.out.print("\n\n    Enter length of rectangle = ");
				d = new_in.nextDouble();
				System.out.print("    Enter breath of rectangle = ");
				e = new_in.nextDouble();
				double perimeterrectangle = d + e ;
				double res = 2 * perimeterrectangle;
				System.out.print("    Perimeter of rectangle = " + res);
			}

		}

		//Calculating area or perimeter of rectangle

		else if (shapename == 3) {
			Scanner new_in = new Scanner(System.in);
			double d ;
			System.out.print("\n              What you want to calculate ?\n");
			System.out.print("              1. Area or 2. Perimeter \n ");
			System.out.print("             Enter : ");
			int choice = input.nextInt();
			System.out.print("\n ====================================================   ");
			if (choice == 1) {
				System.out.print("\n\n    Enter side of square = ");
				d = new_in.nextDouble();
				double area = d * d ;
				System.out.print("    Area of square  =  " + area);

			} else if (choice == 2) {
				System.out.print("\n\n    Enter side of square  = ");
				d = new_in.nextDouble();
				double res = 4 * d;
				System.out.print("    Perimeter of rectangle = " + res);
			}

		}

		else if (shapename == 4) {
			Scanner new_in = new Scanner(System.in);
			double r ;
			System.out.print("\n              What you want to calculate ?\n");
			System.out.print("              1. Area or 2. Perimeter \n ");
			System.out.print("             Enter : ");
			int choice = input.nextInt();
			System.out.print("\n ====================================================   ");
			if (choice == 1) {
				System.out.print("\n\n    Enter radius of circle = ");
				r = new_in.nextDouble();
				double area = (3.14) * r * r ;
				System.out.print("    Area of circle  =  " + area);

			} else if (choice == 2) {
				System.out.print("\n\n      Enter radius of circle  = ");
				r = new_in.nextDouble();
				double res = 2 * (3.14) * r ;
				System.out.print("    Perimeter of rectangle = " + res);
			}

		}
		System.out.print("\n\n ====================================================   \n");

	}
}