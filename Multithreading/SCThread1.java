public class SCThread1 {

    public static void main(String[] args) {

        ATM2 atm = new ATM2();

        Customer c1 = new Customer(atm, "Abhishek", 100);
        Customer c2 = new Customer(atm, "Adarsh", 200);

        c1.start();
        c2.start();
    }
}

class ATM2 {

    synchronized public void checkBalance(String name) {

        System.out.println("Wait! Checking balance for " + name);

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    synchronized public void withdrawMoney(String name, int amount) {

        System.out.println("Wait! " + name + " is withdrawing money");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(name + " withdrew " + amount);
    }
}

class Customer extends Thread {

    ATM2 atm;
    int amount;
    String name;

    Customer(ATM2 atm, String name, int amount) {

        this.atm = atm;
        this.name = name;
        this.amount = amount;
    }

    public void useATM() {

        atm.checkBalance(name);
        atm.withdrawMoney(name, amount);
    }

    public void run() {

        useATM();
    }
}