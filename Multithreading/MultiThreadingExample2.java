public class MultiThreadingExample2 extends Thread{
    public void run(){
        int i =1;
        while(true){
            System.out.println(i +" Hello ");
            i++;
        }
    }


    public static void main(String args[]){
        System.out.println("Implementing Thread in single program ...");
        MultiThreadingExample2 t = new MultiThreadingExample2();
         t.start();
            int j =1;
        while(true){
            System.out.println(j +" world ");
            j++;
        }
    }
}