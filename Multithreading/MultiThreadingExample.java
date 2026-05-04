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

class ThreadExample extends Thread{
    public void run(){
        int i=0;
        while(true){
        System.out.println(i + " world");
        i++;
        }
    } 
}