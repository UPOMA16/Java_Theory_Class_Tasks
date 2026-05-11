import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        
        if (marks >= 0 && marks <= 39) {
            System.out.println("F");
        } else if (marks >= 40 && marks <= 59) {
            System.out.println("C+");
        } else if (marks >= 60 && marks <= 69) {
            System.out.println("B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("A-");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("A");
        } else if (marks >= 90) {
            System.out.println("A+");
        } else {
            System.out.println("Invalid marks");
        }
    }
}
 
