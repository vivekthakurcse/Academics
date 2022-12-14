//Program to display employee records
import java.util.Scanner;

class Employee {
	String name;
	int id ;
	float salary;

	public void getInput() {
		Scanner details = new Scanner(System.in);
		System.out.print("     Enter Employee name : ");
		name = details.nextLine();
		System.out.print("     Enter Employee ID : ");
		id = details.nextInt();
		System.out.print("     Enter Salary of Employee : ");
		salary = details.nextFloat();
		System.out.println();
	}

	public void display() {

		System.out.println("     Empolyee Name : " + name);
		System.out.println("     Empolyee ID : " + id);
		System.out.println("     Empolyee's Salary : " + salary);
		System.out.println();
	}

}

public class EmployeeRecordsSystem {
	public static  void  main(String[] args) {

		Scanner emp_num = new Scanner(System.in);

		System.out.print("Enter the numbers of employee : ");
		int n = emp_num.nextInt();
		Employee e[] = new Employee[n];

		System.out.print("\n ------- Enter Employee's Details ---------\n\n");

		for (int i = 0 ; i < n ; i++) {
			e[i] = new Employee();
			e[i].getInput();
		}

		System.out.print("\n  Empolyee Records ---------\n\n\n");

		for (int i = 0 ; i < n; i++) {
			e[i].display();
		}
	}
}