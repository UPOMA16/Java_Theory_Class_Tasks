public class WalletAppTask1 {

    
    public static double deposit(double balance, double amount) {
        return balance + amount;
    }

    
    public static double withdraw(double balance, double amount) {
        if (amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Insufficient balance!");
            return balance;
        }
    }

    public static void main(String[] args) {
        double balance_1 = 100.0;
        double balance_2 = 50.0;

        balance_1 = deposit(balance_1, 50);  
        balance_2 = withdraw(balance_2, 30); 

        System.out.println("Balance 1: " + balance_1);
        System.out.println("Balance 2: " + balance_2);
    }
}
