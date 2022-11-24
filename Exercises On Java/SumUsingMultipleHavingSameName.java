//wAP to find sum of two integers , sum of two doubles , sum of two floats, sum of 1 int and 1 double using multiple function having similar names
public class SumUsingMultipleHavingSameName {
    void sum(int x, int y){
        System.out.println("sum of "+ x +" + "+ y +" = " + (x+y));
    }
    void sum(double x, double y){
        System.out.println("sum of "+ x +" + "+ y +" = " + (x+y));
    }
    void sum(float x, float y){
        System.out.println("sum of "+ x +" + "+ y +" = " + (x+y));
    }
    void sum(int x, double y){
        System.out.println("sum of "+ x +"  +" + y +" = " + (x+y));
    }
    public static void main(String []args){
        SumUsingMultipleHavingSameName s = new SumUsingMultipleHavingSameName();
        s.sum(4, 5);
        s.sum(5.4,3.6);
        s.sum(3.5f, 6.5f);
        s.sum(2, 8);
    }
}
