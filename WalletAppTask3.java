class WalletWithID {
    private static int counter = 1; 
    private final int id;            
    private double balance;

    
    public WalletWithID() {
        this.id = counter++;
        this.balance = 0;
    }

    
    public WalletWithID(double balance) {
        this.id = counter++;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) this.balance -= amount;
        else System.out.println("Insufficient balance!");
    }
}

public class WalletAppTask3 {
    public static void main(String[] args) {
        WalletWithID w1 = new WalletWithID();
        WalletWithID w2 = new WalletWithID(200);

        w1.deposit(50);
        w2.withdraw(100);

        System.out.println("Wallet1 id: " + w1.getId() + ", balance: " + w1.getBalance());
        System.out.println("Wallet2 id: " + w2.getId() + ", balance: " + w2.getBalance());
    }
}

