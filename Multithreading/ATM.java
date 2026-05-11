public class ATM {
   private int balance = 10000;

   int  checkBalance(String name){
      System.out.println("your current balance is "+ balance);
         return balance;
    }


    
    public void withdrawMoney(String name , int amount){
          if(amount > balance){
            System.out.println("Insufficient balance");
          }else if(amount <= balance){
            balance = balance - amount;
          System.out.println(name + "has withdrawn" + amount + "and remaining balance is "+ balance);
          }
    }

    public static void main(String[] args){

      ATM  myatm = new ATM();
      Customer1 c1 = new Customer1(myatm);
      Customer2 c2 = new Customer2(myatm);
      c1.useATM(myatm, "Customer1", 5000);
      c2.useATM(myatm, "Customer2", 6000);

    }
}


class Customer1 extends Thread{
    ATM atm;
    String name ;
    int amount;


       Customer1(ATM atm){
         this.atm = atm;
      }    

    void useATM(ATM atm , String name , int amount){
      atm.checkBalance(name);
         atm.withdrawMoney(name, amount);
    }
}



class Customer2  extends Thread{
      ATM atm ;
      String name;
      int amount;
      Customer2(ATM atm){
         this.atm = atm;
      }

         void useATM(ATM atm , String name , int amount){
      atm.checkBalance(name);
         atm.withdrawMoney(name, amount);
    }

}


