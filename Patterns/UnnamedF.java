
import java.util.*;

public class EmptySquarePattern {
	public  static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.print(" Enter the max no. of rows : ");
		n = sc.nextInt();
		System.out.print("\n -------- Your Pattern -------\n\n");
		for (int i = 0 ; i <= n ; i++) {
			for (int j = 0; j - i <= n  ; j++) {
				System.out.print("\t -------- \t");
			}
		
		}	System.out.println();
		for (int i = 0 ; i <=  n  ; i++) {
			for (int j = 0 ; j <= n; j++) {
				System.out.print("\t -------- \t");
				
			}
		}
		System.out.println();
	}
}