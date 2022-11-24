public class AreaConst{
    AreaConst(int l, int b){
        int area = l*b;
        System.out.println("Area of rectangle : "+ area);
    }
    AreaConst(double r){
        double area = Math.PI*r*r;
        System.out.println("Area of circle : " + area);
    }
    AreaConst(int r){
        double area = (double)(4/3)*Math.PI*r*r*r;
        System.out.println("Area of sphere : " + area);
    }
    public static void main(String[] args){
        AreaConst a = new AreaConst(4,5);
        AreaConst a1 = new AreaConst(6);
        AreaConst a2 = new AreaConst(8);
    }
}
