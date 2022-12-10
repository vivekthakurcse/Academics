//Decreasing Star Pattern
import java.util.*;


public class UnnamedD {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n ;
		System.out.print("\n Enter Max no. of Rows : ");
		n = input.nextInt();
		System.out.print("\n\n -------- Your Pattern -------\n\n");

		for (int i = 0 ; i <= n; i++) {
			for (int j = i ;  j <= n ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}