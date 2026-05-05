public class Synchronyzation{


 public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread user1 = new Thread(() -> account.withdraw(7000), "User1");
        Thread user2 = new Thread(() -> account.withdraw(7000), "User2");

        user1.start();
        user2.start();
    }
    

}



class BankAccount {
    private int balance = 10000;

    // synchronized method
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            
            try {
                Thread.sleep(100); // simulate processing delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}