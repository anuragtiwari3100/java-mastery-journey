public class Example1 {
    public static void printData(){
        int i =0;
        while(true){
                System.out.println(i + " Hello");
                i++;
        }
    }



    public static void main(String[] args) {
        System.out.println("Hello, World!");
         printData();  // below will not execute without multithreading
        while(true){
            int x =0;
                System.out.println("Worlds ");
                    x++;
        }
    }
}