class WalletUtility {

    public static void addBonus(WalletWithMode wallet, double amount) {
        wallet.deposit(amount);
    }

    
    public static void swapWallets(WalletWithMode w1, WalletWithMode w2) {
        WalletWithMode temp = w1;
        w1 = w2;
        w2 = temp;
        
    }
}

public class WalletAppTask5 {
    public static void main(String[] args) {
        WalletWithMode w1 = new WalletWithMode(100);
        WalletWithMode w2 = new WalletWithMode(200);

    
        WalletUtility.addBonus(w1, 50);
        System.out.println("Wallet1 balance after bonus: " + w1.getBalance());

        
        WalletUtility.swapWallets(w1, w2);
        System.out.println("Wallet1 balance after swap attempt: " + w1.getBalance());
        System.out.println("Wallet2 balance after swap attempt: " + w2.getBalance());
        System.out.println("Note: Swap did not change references in main()!");
    }
}
