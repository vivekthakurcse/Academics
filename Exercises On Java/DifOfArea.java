import java.util.Scanner;

//WAP to calculate area of two differwent circle and print the different of area 
public class DifOfArea {
    double area1,area2;

   double Area( )
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of the circle");
    int radius = sc.nextInt();
    double a1 = 3.14*radius*radius;
    sc.close();
    return a1;
   }

   void diff(double x , double y){
      System.out.println("difference of area2 & area1 = " + (area2-area1));

   }

   public static void main(String args[]){

    DifOfArea a = new DifOfArea();
    area1 = a.Area();        //area1 = a.Area(4);
    area2 = a.Area();       //area2 = a.Area(5);
    a.diff(area1 , area2);
    
   }
} 
    