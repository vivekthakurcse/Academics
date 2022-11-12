import java.util.* ;

public class ResultCalculator {
	public static void main(String[] args) {
		String name ;
		int  roll ;
		int m1, m2, m3, m4, m5 ;
		float total, percentage ;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n\n\n                      Result Calculator                    \n");
	    System.out.print("\n ==========================================================\n");
		System.out.print("\n     Enter your name : ");
		name = sc.nextLine();
		System.out.print("     Enter your Roll No. : ");
		roll = sc.nextInt();
		System.out.print("\n ===========================================================\n");
		System.out.print("\n     Enter your obtained marks in following subjects: \n");
		System.out.print("\n     Mathematics =  ");
		m1 = sc.nextInt();
		System.out.print("     Science = ");
		m2 = sc.nextInt();
		System.out.print("     Social Science = ");
		m3 = sc.nextInt();
		System.out.print("     Hindi = ");
		m4 = sc.nextInt();
		System.out.print("     English = ");
		m5 = sc.nextInt();

		total = m1 + m2 + m3 + m4 + m5 ;
		if (total > 500) {
			System.out.print("Enter your marks correctly");
		}

		else {
			percentage = total / 5 ;
			System.out.print("\n =========================================================\n");
			System.out.print("\n     Name of student :  " + name);
			System.out.print("\n     Roll No.  : " + roll);
			System.out.print("\n     You got " + percentage + "% in boards\n\n\n ");
		}
	}
}
