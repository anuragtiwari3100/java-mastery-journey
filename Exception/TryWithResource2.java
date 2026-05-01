import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResource2 {

    public static int ReadingFromFile() {
        FileInputStream fis;
        Scanner sc = null;
          int res=0; 
        try {
            fis = new FileInputStream("Database.txt");
            sc= new Scanner(fis);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println("The value of a is : " + a);
            System.out.println("The value of b is : " + b);
            System.out.println("The value of c is : " + c);
             res = b/c;


        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe);
        }catch(ArithmeticException ae){
            System.out.println("Error is   "+ ae);
        }finally{
            sc.close();
        }
      return res;
    }

    public static void main(String args[]) {
        System.out.println("Try with resources example2.....");
        ReadingFromFile();
    }

}
