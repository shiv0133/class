package methods;

public class Examples {
    // square of number
 public void makeSquare(){
     int number =27;
     int square =number*number;
     System.out.println("Square of number : " +square);
 }
 public void voting(){
     int age =17;
     if( age > 18 ){
         System.out.println("eligible for voting");
     }
     else {
         System.out.println("not eligible for voting ");
     }
 }

    public static void main(String[] args) {
     Examples obj = new Examples();
     obj.makeSquare();
     obj.voting();

    }

}
