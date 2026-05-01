public class practicsException {

  
    public int calculateArea(int length , int breath) throws Exception{
        if(length < 0 || breath <0){
            throw new NegativeValuedChecker();
        }
        return  length * breath;
    }

    public int method2(int x , int y){
        int res =0;
        try{
      res = calculateArea(x,y);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return  res;
    }

    public static void main(String args[]){
        System.out.println("Practicing Exception ");
        practicsException obj = new practicsException();
        System.out.println(obj.method2(10,11));
    }
    
}


 class NegativeValuedChecker  extends Exception {
    public String toString(){
     return "Valued can not be exception";
    }
 }


