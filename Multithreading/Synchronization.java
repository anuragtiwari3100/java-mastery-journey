public class Synchronization {
    public static void main(String[] args) {
      MyData  data= new MyData();
    MyThread1 t1= new MyThread1(data);
    MyThread2 t2 = new MyThread2(data);
    t1.start();
    t2.start();
    }
}

// class MyData{
//          public void display(String str){
//           synchronized (this) {
//                  for(int i=0; i<str.length(); i++){
//           System.out.print(str.charAt(i));
//            } 
//         System.out.println();
//           } 
//       }    
// }

class MyData{
    public void display(String str) {
        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            try {
                Thread.sleep(10);
            } catch(Exception e) {

            }
        }
           System.out.println();
    }   
}




class MyThread1 extends Thread{
 MyData d ;
    MyThread1(MyData d){
      this.d = d;
    }

    public void run(){
      d.display("Hello world");
    }

}

class MyThread2 extends  Thread{
  MyData d ;

    public MyThread2(MyData d) {
      this.d = d;
    }
   
    public void run(){
      d.display("welcome All");
    }
}