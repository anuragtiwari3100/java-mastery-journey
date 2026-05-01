
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TryWithResource1{
  

    public static void ReadingFfromFile(){
        try(FileReader fr  = new FileReader("C:\\Users\\anura\\OneDrive\\Desktop\\Me.txt");  //we can also use resources here in try block
        BufferedReader br = new BufferedReader(fr);
    ){
        String data ;
        while((data = br.readLine()) != null){
            System.out.println(data);   
        }
    }catch(FileNotFoundException fnfe){
        System.out.println(fnfe);
    }catch(IOException ioe){
        System.out.println(ioe);
    }
    }


    public static void main(String args[]){
        System.out.println("Try with resources example....");
        ReadingFfromFile();
    }
}