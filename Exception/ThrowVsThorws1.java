public class ThrowVsThorws1 {
    
    int area(int length, int breath) throws Exception{
        if(length <0 || breath <0){
            throw new Exception("Dimension can't be negative");
        }
        return length*breath;
    }
     void meath2(){
        try {
            area(-10,-20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args){
        System.out.println("Throw vs Throws Example....");
        ThrowVsThorws1 obj = new ThrowVsThorws1();
        obj.meath2();
    }
    
}
