public class MultiThreadingUsingRunnableInterfac implements Runnable  {
    public void run(){
    int i=1;
   while(true){
    System.out.println(i + " Hello");
    i++;
   }
}
    public static void main(String[] args){
        System.out.println("Implementing MultiThreading using Runnable Interface ...");
MultiThreadingUsingRunnableInterfac   mt = new MultiThreadingUsingRunnableInterfac();
Thread t = new Thread(mt);
t.start();
          int j=1;
   while(true){
    System.out.println(j + " Hello");
    j++;
    }
    
}
}
