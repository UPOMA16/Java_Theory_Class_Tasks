import java.util.Scanner;

public class PositiveIntegerCheck {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("Positive integer");
        } 
        else {
            System.out.println("Not a positive integer");
        }
    }
}
