import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int salesPercentage = sc.nextInt();      
        int attendancePercentage = sc.nextInt(); 

        if (salesPercentage >= 95 && attendancePercentage == 100) {
            System.out.println("Bonus: 60%");
        } 
        else if (salesPercentage >= 95 && attendancePercentage >= 90) {
            System.out.println("Bonus: 40%");
        } 
        else if (salesPercentage >= 80 && attendancePercentage == 100) {
            System.out.println("Bonus: 40%");
        } 
        else if (salesPercentage >= 80 && attendancePercentage >= 90) {
            System.out.println("Bonus: 20%");
        } 
        else {
            System.out.println("Bonus: 5%");
        }
    }
}

