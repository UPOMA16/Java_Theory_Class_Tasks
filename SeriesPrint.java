public class SeriesPrint {
    public static void main(String[] args) {
        //for loop
        System.out.print("Even series:");
        for(int i=2;i<=20;i+=2) { 
            System.out.print(i+" "); 
        }
        System.out.print("\nOdd series:");
        for(int i=1;i<20;i+=2){
            System.out.print(i+" ");
        }

        //while loop
        int i=2;
        System.out.print("\nEven series:");
        while(i<=20){
            System.out.print(i+" ");
            i+=2;
        }
         i=1;
        System.out.print("\nOdd series:");
        while(i<20){
           System.out.print(i+" ");
            i+=2; 
        }
        //do while
         i=2;
        System.out.print("\nEven series:");
        do{
            System.out.print(i+" ");
            i+=2;
        } while(i<=20);
         i=1;
        System.out.print("\nOdd series:");
        do{
            System.out.print(i+" ");
            i+=2;
        }while(i<20);

    }

    
}
