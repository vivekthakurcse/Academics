//Program to solve quadratic equation
//By Vivek Thakur


import java.util.*;


public class QuadEquationSolver {
	public static void main(String[] args) {
		System.out.print("\n\n   Quadratic Equation Solver\n\n");
		System.out.print("   ===============================================\n");
		double a, b, c, D, X, Y ;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n       Enter the value of a = ");
		a = sc.nextDouble();
		System.out.print("       Enter the value of b = ");
		b = sc.nextDouble();
		System.out.print("       Enter the value of c = ");
		c = sc.nextDouble();
		System.out.print("\n         Given Equation is  " + a + "x² + " + b + "x + " + c);
		D = b * b - 4 * a * c ;
		System.out.print("\n         D = " + D);
		if (D > 0) {
			System.out.print("\n         Equation have real and unequal solutions");
			X = (-(b * b) + Math.sqrt(D)) / 2 * a ;
			Y = (-(b * b) - Math.sqrt(D)) / 2 * a ;
			System.out.print("\n         Solutions are : \n");
			System.out.print("         X¹ = " + X);
			System.out.print("\n         X² = " + Y);

		}

		else if (D == 0) {
			System.out.print("\n         Equation have real and equal solutions");
			X = (-(b * b) + Math.sqrt(D)) / 2 * a ;
			System.out.print("\n         Solutions are : \n");
			System.out.print("         X¹ = " + "± " + X);
		}

		else {
			System.out.print("\n         Equation have imaginary solutions");
		}

		System.out.print("\n\n   ===============================================\n\n");

	}
}
