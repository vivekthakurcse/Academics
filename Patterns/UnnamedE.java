//Square Pattern In Java
import java.util.* ;

public class UnnamedE {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter Max no. of rows : ");
		n = sc.nextInt();
		System.out.print("\n -------- Your Pattern -------\n\n");

		for (int i = 0 ; i <= n ; i++) {
			for (int j = 0 ; j <= n ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}