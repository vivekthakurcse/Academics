
//Increasing Star Pattern
import java.util.*;

class UnnamedC {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.print("Enter the max no. of rows : ");
    n = sc.nextInt();
    for (int i = 0; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(" * ");
      }
      System.out.println();
    }

  }
}