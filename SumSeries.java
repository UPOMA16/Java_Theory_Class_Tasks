public class SumSeries {
    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        //for loop
        System.out.print("Even series:");
        for(int i=2;i<=20;i+=2) { 
            System.out.print(i+" "); 
            sumEven += i;
        }

        System.out.print("\nOdd series:");
        for(int i=1;i<20;i+=2){
            System.out.print(i+" ");
            sumOdd += i;
        }

        System.out.println("\nEven Sum = " + sumEven);
        System.out.println("Odd Sum = " + sumOdd);

        //while loop
        int i=2;
        sumEven = 0;
        sumOdd = 0;

        System.out.print("\nEven series:");
        while(i<=20){
            System.out.print(i+" ");
            sumEven += i;
            i+=2;
        }

        i=1;
        System.out.print("\nOdd series:");
        while(i<20){
            System.out.print(i+" ");
            sumOdd += i;
            i+=2; 
        }

        System.out.println("\nEven Sum = " + sumEven);
        System.out.println("Odd Sum = " + sumOdd);

        //do while
        i=2;
        sumEven = 0;
        sumOdd = 0;

        System.out.print("\nEven series:");
        do{
            System.out.print(i+" ");
            sumEven += i;
            i+=2;
        } while(i<=20);

        i=1;
        System.out.print("\nOdd series:");
        do{
            System.out.print(i+" ");
            sumOdd += i;
            i+=2;
        }while(i<20);

        System.out.println("\nEven Sum = " + sumEven);
        System.out.println("Odd Sum = " + sumOdd);

    }
}