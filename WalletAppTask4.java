class WalletWithMode {
    private static int counter = 1;
    private final int id;
    private double balance;
    private String lastWithdrawMode; 

    public WalletWithMode() {
        this.id = counter++;
        this.balance = 0;
    }

    public WalletWithMode(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public int getId() { return id; }
    public double getBalance() { return balance; }
    public String getLastWithdrawMode() { return lastWithdrawMode; }

    public void deposit(double amount) {
        this.balance += amount;
    }

    
    public void withdraw(double amount) {
        withdraw(amount, "CASH");
    }

    
    public void withdraw(double amount, String mode) {
        if (amount <= this.balance) {
            this.balance -= amount;
            this.lastWithdrawMode = mode;
        } else {
            System.out.println("Insufficient balance!");
        }
    }
}

public class WalletAppTask4 {
    public static void main(String[] args) {
        WalletWithMode w1 = new WalletWithMode(500);
        w1.withdraw(100);            
        w1.withdraw(50, "ATM");     

        System.out.println("Balance: " + w1.getBalance());
        System.out.println("Last withdraw mode: " + w1.getLastWithdrawMode());
    }
}

