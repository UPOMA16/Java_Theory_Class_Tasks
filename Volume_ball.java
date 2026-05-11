import java.util.Scanner;
public class Volume_ball {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        double r =sc.nextDouble();

    double Volume=(4/3)* Math.PI * Math.pow(r,3);
        System.out.println(Volume);
}
}
