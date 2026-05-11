import java.util.Scanner ;

public class EquilateralTriangleArea {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        double r= sc.nextDouble();
        double area=(Math.sqrt(3)/4 *r*r);
        System.out.println(area);
    }
}
