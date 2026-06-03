import java.util.Scanner;

class CGPACalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] credits = new int[5];
        int[][] marks = new int[5][5];

        System.out.println("Enter credits for 5 subjects:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            credits[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter grade points for Student " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            double sum = 0;
            int totalCredits = 0;
            for (int j = 0; j < 5; j++) {
                sum = sum + marks[i][j] * credits[j];
                totalCredits = totalCredits + credits[j];
            }
            double cgpa = sum / totalCredits;
            System.out.println("Student " + (i + 1) + " CGPA = " + cgpa);
        }
    }
}
