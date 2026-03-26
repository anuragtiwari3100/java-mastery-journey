

class Rectangle{


    private int length;
    private int  breath;

    public Rectangle(){
        length =1;
        breath =1;
    }

    //   public Rectangle(){
    //  System.out.println("hi  ");
    // }

    public Rectangle(int length , int breath){
      this.length = length;
      this.breath = breath;
    }

    public Rectangle(int x){
        length = breath = x;
    }


    public   int area(){
        return length*breath;
    }
     
}

public class PracticingConstructor {

public static void main(String[] args) {
        Rectangle r = new Rectangle(10,50);
        System.out.println(r.area());

}    
}
