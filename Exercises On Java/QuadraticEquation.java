public class QuadraticEquation {
    void equation(double a,double b,double c){
        System.out.println("the equatiopn is " + a +"x2 + " + b + "x + "+c + " = 0");
        double D = ((b*b) - (4*a*c));
        if(D>0){
            double x = (-b + Math.sqrt(D))/(2*a);
            double y = (-b - Math.sqrt(D))/(2*a);
            System.out.println("Answer : " + x);
            System.out.println("Answer : " + y);
        }
    }
    public static void main(String []args){
QuadraticEquation e = new QuadraticEquation();
e.equation(3, -5, 2);
    }
}
