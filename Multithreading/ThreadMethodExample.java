

public class ThreadMethodExample {
    public static void main(String args[]){
       MyThread t = new MyThread("My Thread 1"); 
       System.out.println("Thread Name : " + t.getName());
       t.start();
       t.interrupt();
       System.out.println("Thread State : " + t.getState());
       System.out.println("Thread State : " + t.getId());
       System.out.println("Thread State : " + t.getThreadGroup());
    }
}


class MyThread extends Thread{
      public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
      }
}
