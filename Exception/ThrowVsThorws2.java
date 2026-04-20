


public class ThrowVsThorws2 extends NegativeBalanceExeption{
       
    int area(int length, int breath) throws Exception{
        if(length <0 || breath <0){
            throw new NegativeBalanceExeption();
        }
        return length*breath;
    }
     void meath2(){
        try {
            area(-10,-20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
               System.out.println(e);
        }
    }

    public static void main(String[] args) {
        ThrowVsThorws2 obj = new ThrowVsThorws2();
        System.out.println("Throw vs Throws Example....");
        obj.meath2();
       
    }   
}


class  NegativeBalanceExeption extends Exception{
     public String toString(){
        return "Balance can't less then 0" ;
     }
}
