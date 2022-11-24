import java.util.*;
public class AllBasicPattern {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter N : ");
        n = sc.nextInt();
        System.out.println();
        
        // full solid pyramid
        for(int i =1;i<=n;i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        //1st half pyramid
        for(int i =1;i<=n;i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");//niche * ke baad space diye hai to yha 2 space dena pdega
            }
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
       // 2nd half pyramid
        for(int i =1;i<=n;i++){
            for(int j= 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        
          //1st half Hollow pyramid
        for(int i =1;i<=n;i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print("  ");//niche * ke baad space diye hai to yha 2 space dena pdega
            }
            for(int j= 1; j<=i; j++){
                if(i==n || j==i || j ==1)
                		System.out.print("* ");
                else
                    System.out.print("  ");//uper * ke baad space diye hai to yha 2 space dena pdega
            }
            System.out.println();
        }
       
        System.out.println("\n=======================\n");
        
       // 2nd half Hollow pyramid
        for(int i =1;i<=n;i++){
            for(int j= 1; j<=i; j++){
                if(i==n || j==1 || j==i)
               		 System.out.print("* ");
                else
                    System.out.print("  ");//uper * ke baad space diye hai to yha 2 space dena pdega
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        //inverted pyramid
        for(int i = n; i>=1; i--){
             for(int j =1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }        
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        //inverted 1st half pyramid
        
        for(int i = n; i>=1; i--){
            for(int j =1; j<=(n-i);j++){
                System.out.print("  ");//niche * ke baad space diye hai to yha 2 space dena pdega 
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        //inverted 2nd half pyramid
        
        for(int i = n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        //Solid Square
        for(int i =1;i <=n;i++){
            for(int j = 1;j <=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        //Hollow Square
        for(int i =1;i <=n;i++){
            for(int j = 1;j <=n;j++){
                if(i==1 || j==1 || i==n || j==n )
              		  System.out.print("* ");
                else
                    System.out.print("  ");//uper space diye hai to yha 2 space dena pdega
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        
        //Solid Rectangle
        
        System.out.print("Enter M : ");
        int m = sc.nextInt();
        System.out.println();
        
        for(int i =1; i <= n; i++){
            for(int j =1;j<=m; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        
        
        //Hollow Rectangle
        
        for(int i =1; i <= n; i++){
            for(int j =1;j<=m; j++){
                if(i==1 || j==1 || i==n || j==m )
                		System.out.print("* ");
                else
                    System.out.print("  ");//uper space diye hai to yha 2 space dena pdega
            }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        
      //Rhombus
        for(int i=1;i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
        
        // Hollow Rhombus
        for(int i=1;i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n;j++){
                if(i==n || j==1 || j==n || i==1 )
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        
        
        System.out.println("\n=======================\n");
        //Solid Butterfly 
        
        for(int i = 1; i<=n; i++)
            {
            //for rows
            //print * at beginning
            for(int j =1; j<=i; j++)
                {
               System.out.print("*");
            }
            //print space
            for(int j =1; j<=2*(n-i); j++)
                {
                System.out.print(" ");
            }
            //print * at end
            for(int j =1; j<=i; j++)
                {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //invert 
        //for columns
        for(int i = n; i>=1; i--)
            {
            //for rows
            //print * at beginning
            for(int j =1; j<=i; j++)
                {
                System.out.print("*");
            }
            //print space
            for(int j =1; j<=2*(n-i); j++)
                {
                System.out.print(" ");
            }
            //print * at end
            for(int j =1; j<=i; j++)
                {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        System.out.println("\n=======================\n");
        
        
      //Hollow Butterfly 
      //for columns
        for(int i = 1; i<=n; i++)
            {
            //for rows
            //print * at beginning
            for(int j =1; j<=i; j++)
                {
                if(j==1 || j==i)
                		System.out.print("*");
                else
                    System.out.print(" ");
            }
            //print space
            for(int j =1; j<=2*(n-i); j++)
                {
                System.out.print(" ");
            }
            //print * at end
            for(int j =1; j<=i; j++)
                {
                if(j==1 || j==i)
              		  System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        //invert 
        //for columns
        for(int i = n; i>=1; i--)
            {
            //for rows
            //print * at beginning
            for(int j =1; j<=i; j++)
                {
                if(j==1 || j==i)
                		System.out.print("*");
                else
                    System.out.print(" ");
            }
            //print space
            for(int j =1; j<=2*(n-i); j++)
                {
                System.out.print(" ");
            }
            //print * at end
            for(int j =1; j<=i; j++)
                {
                if(j==1 || j==i)
                		System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        
        /*
         * 1
         * 1 2
         * 1 2 3
         */
        for(int i =1; i<=n;i++){
            for(int j =1; j<=i;j++){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *       1
         *     1 2
         *   1 2 3
         */
        for(int i =1; i<=n;i++){
            for(int j =1; j<=n-i;j++){
            System.out.print("  ");
        }
            for(int j =1; j<=i;j++){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        
        System.out.println("\n=======================\n");
        
        /*
         *       1
         *     2 1
         *   3 2 1
         */
        
        for(int i =1; i<=n;i++){
            for(int j =1; j<=n-i;j++){
            System.out.print("  ");
        }
            for(int j =i; j>=1;j--){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         * 1
         * 2 1
         * 3 2 1
         */
        for(int i =1; i<=n;i++){
          
            for(int j =i; j>=1;j--){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         * 3 2 1
         * 2 1
         * 1
         */
        for(int i =n; i>=1;i--){
          
            for(int j =i; j>=1;j--){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         * 3 2 1
         *   2 1
         *     1
         */
        for(int i =n; i>=1;i--){
          for(int j =1; j<=(n-i);j++){
            System.out.print("  ");
        }
            for(int j =i; j>=1;j--){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *     1
         *    1 2
         *   1 2 3
         *  1 2 3 4
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            System.out.print(" ");
        }
            for(int j =1; j<=i;j++){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        
        System.out.println("\n=======================\n");
        /*
         * 1 2 3 4
         *  1 2 3
         *   1 2
         *    1
         */
        for(int i =n; i>=1;i--){
          for(int j =1; j<=(n-i);j++){
            System.out.print(" ");
        }
            for(int j =1; j<=i;j++){
            System.out.print(j +" ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *    1
         *   2 2
         *  3 3 3
         * 4 4 4 4
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            System.out.print(" ");
        }
            for(int j =1; j<=i;j++){
            System.out.print(i +" ");
        }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        /*
         *    1
         *   0 1
         *  1 0 1
         * 0 1 0 1
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            System.out.print(" ");
        }
            for(int j =1; j<=i;j++){
                if((i+j)%2==0)
            				System.out.print("1 ");
                else
                    System.out.print("0 ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         */
         for(int i =1; i<=n;i++){
          
            for(int j =1; j<=i;j++){
                if((i+j)%2==0)
            				System.out.print("1 ");
                else
                    System.out.print("0 ");
        }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        /*
         *    1
         *   1 1
         *  1 1 1
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            	System.out.print(" ");
      	  }
            for(int j =1; j<=i;j++){    
            				System.out.print("1 ");
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         * 1 2 3 4
         * 1 2 3
         * 1 2
         * 1
         */
        for(int i =n; i>=1;i--){
         
            for(int j =1; j<=i;j++){    
            				System.out.print(j+" ");
        }
            System.out.println();
        }
        System.out.println("\n=======================\n");
        /*
         * 1
         * 2 3
         * 4 5 6
         * 7 8 9 10
         */
        int number=1;        
        for(int i =1; i<=n;i++){          
            for(int j =i; j>=1;j--){
           			 System.out.print(number +" ");
                 number++;
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *     1
         *    2 3
         *   4 5 6
         *  7 8 9 10
         */
        int number2 =1;
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            	System.out.print(" ");
      	  }
            for(int j =i; j>=1;j--){
            System.out.print(number2 +" ");
                number2++;
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *    1
         *   212
         *  32123
         * 4321234
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            	System.out.print(" ");
      	  }
            for(int j =i; j>=1;j--){
            System.out.print(j);
        }
            for(int j =2; j<=i;j++){
            System.out.print(j);
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        /*
         *     11
         *    2112
         *   321123
         *  43211234
         */
        for(int i =1; i<=n;i++){
          for(int j =1; j<=(n-i);j++){
            	System.out.print(" ");
      	  }
            for(int j =i; j>=1;j--){
            System.out.print(j);
        }
            for(int j =1; j<=i;j++){
            System.out.print(j);
        }
            System.out.println();
        }
        
        System.out.println("\n=======================\n");
        
    }
    
}