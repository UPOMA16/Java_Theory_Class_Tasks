import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int a, b;
        char ch;

        System.out.print("Enter a: ");
        a = s.nextInt();

        System.out.print("Enter b: ");
        b = s.nextInt();

        System.out.print("Enter ch: ");
        ch = s.next().charAt(0);

        if (ch == '+') {
            System.out.println("Result = " + (a + b));
        }
        else if (ch == '-') {
            System.out.println("Result = " + (a - b));
        }
        else if (ch == '*') {
            System.out.println("Result = " + (a * b));
        }
        else if (ch == '/') {
            System.out.println("Result = " + (a / b));
        }
    
    
    }
}