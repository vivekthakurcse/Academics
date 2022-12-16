//class and object

import java.util.Scanner ;

class Employee {
	String name;
	int id;
	float salary;

	//creating a member function to get inputs
	public  void getRecords() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\t Enter Employee name   : ");
		name = sc.nextLine();
		System.out.print("\t Enter Employee ID     : ");
		id = sc.nextInt();
		System.out.print("\t Enter Employee Salary : ");
		salary = sc.nextFloat();
	}

	//creating a member function to display that inputs
	public void display() {
		System.out.println("\n\n\t-------Employee Records-------");
		System.out.println("\t| Name : " + name);
		System.out.println("\t| ID   : " + id);
		System.out.println("\t| Salary : " + salary);
	}
}

public class EmployeeRecords {
	public  static  void main(String[] args) {
		Employee e1 = new Employee();
		e1.getRecords();
		e1.display();
	}
}