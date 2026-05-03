public class MultiThreadingExample {

     public static void main(String[] args){
        ThreadExample t1 = new ThreadExample();
        t1.start();
        int i=0;
        while(true){
            System.out.println( i +"Hello");
            i++;
        }
     }
}



//Signature of run meathodmust be as follows
// Must be public
// Return type must be void
// Takes no arguments
// Cannot throw checked exceptions in the signature (like throws Exception )

class ThreadExample extends Thread{
    public void run(){
        int i=0;
        while(true){
        System.out.println(i + " world");
        i++;
        }
    } 
}