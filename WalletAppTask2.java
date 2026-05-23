class Wallet {
    private double balance;

    
    public Wallet(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        this.balance += amount;
    }

    
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    
    public double getBalance() {
        return this.balance;
    }
}

public class WalletAppTask2 {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet(100);
        Wallet wallet2 = new Wallet(50);

        wallet1.deposit(50);
        wallet2.withdraw(30);

        System.out.println("Wallet1 balance: " + wallet1.getBalance());
        System.out.println("Wallet2 balance: " + wallet2.getBalance());
    }
}
