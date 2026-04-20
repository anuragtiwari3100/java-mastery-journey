public class CheckedUnchecked2 {
    static void fun1(){
        try {
            throw new CustomException();

        } catch (CustomException e) {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }

    static void fun2(){
          fun1();
    }
     
    static void  fun3(){
        fun2();
    }
     

public static void main(String args[]){
    System.out.println("Custom Exception Example....");
    fun3();
 }    
}
@override
 class CustomException extends Exception{
    public String toString(){
        return "Balanced can't less then 0";
    }
}












