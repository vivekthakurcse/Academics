//Grading System using Java
//Programmed by vivek thakur

import java.util.Scanner ;

class StudentGrades {
	String name;
	int roll ;
	float m1;
	float m2;
	float m3;
	float m4;
	float m5;
	float total;
	float percentage;

	public void getGrades() {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n----------Enter your name and roll --------\n");
		System.out.print("\n     Your Name : ");
		name = sc.nextLine();
		System.out.print("     Roll No. : ");
		roll = sc.nextInt();
		System.out.println("\n-------------Enter your grades------------\n");
		System.out.print("     Mathematics  :  ");
		m1 = sc.nextInt();
		System.out.print("     Physics      :  ");
		m2 = sc.nextInt();
		System.out.print("     Chemistry    :  ");
		m3 = sc.nextInt();
		System.out.print("     Economics    :  ");
		m4 = sc.nextInt();
		System.out.print("     English      :  ");
		m4 = sc.nextInt();
	}

	public void calculateAndDisplay() {
		total = m1 + m2 + m3 + m4 + m5;
		percentage = total / 5;
		System.out.print("\n--------------Your Grades------------\n\n");
		if ((percentage > 80) && (percentage < 100)) {

			System.out.println("\n   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you got A+ ");

		} else if ((percentage > 70) && (percentage < 80)) {

			System.out.println("   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you got A ");

		} else if ((percentage > 60) && (percentage < 70 )) {

			System.out.println("   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you got B ");

		} else if ((percentage > 50) && (percentage < 60)) {

			System.out.println("   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you got C ");

		} else if ((percentage > 35) && (percentage < 50)) {

			System.out.println("   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you got D ");

		} else if ((percentage > 0) && (percentage < 35)) {

			System.out.println("   Name : " + name);
			System.out.println("   Roll : " + roll);
			System.out.println("   Congratulations you have failed in your examintaion!! ");

		}
	}
}


//Creating my main class
public class StudentGradingSystem {
	public  static  void main(String[] args) {
		StudentGrades sg = new StudentGrades();
		sg.getGrades();
		sg.calculateAndDisplay();
	}
}