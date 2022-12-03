package methods;

public class ReturnType {
    // return type
    public String hello(String name){
        String message = "welcome to java " +name;
        System.out.println(message);
        return  message;
    }
    public int makeSquare(int number){
        int Square = number*number;
        return Square;
    }
    public String checkPrice(double price){
        if(price>5000){
            return "price is high";
        }
        else{
            return "price is not high";
        }

    }

    public static void main(String[] args) {
        ReturnType obj= new ReturnType();
        String result = obj.hello("Rajendra");
        int Square =obj.makeSquare(18);
        System.out.println("Square of number " +Square);
        String var =obj.checkPrice(5454.23);
        System.out.println("output " +var);
    }
}
