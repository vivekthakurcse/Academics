import java.util.*;
public class Sum {
    public static void main(String[] args){
        int a , b , sum;
        Scanner num =  new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        a = num.nextInt();
        System.out.print("Enter the value of b =  ");
        b = num.nextInt();
        sum= a+b;
        System.out.print("Sum=" + sum);
    }
}