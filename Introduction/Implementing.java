 class DataHiding {
      private  int length;
      private  int breath;

  
     //  DataHiding(int x , int y){
     // length = x;
     // breath = y;
     //  }



    public int getLength(){
        return length;
    }
    
    public void setLeangth(int length){
         this.length = length;
    }

    public int getBreath(){
         return  breath;
    }
    
    public void setBreath(int breath){
       this.breath = breath;
    }

  public  int Area(){
     return length*breath;
  }
}

public class Implementing{
   public static void   main(String[] args){
     // DataHiding dh = new DataHiding(10,20);
      DataHiding dh = new DataHiding();
//      // dh.length=10;
//      // dh.breath= 20;
//  dh.setLeangth(10);
//  dh.setBreath(20); 
//   System.out.print(dh.Area());


   }
}