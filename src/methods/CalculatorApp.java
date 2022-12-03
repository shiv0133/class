package methods;

public class CalculatorApp {
    //Add
    // SYNTAX : access_specifier DataType method_Name (input parameter) {CODE}
    public int Add(int a, int b){
        return a+b;
    }
    //sub
    public int sub(int a, int b){
        return a-b;
    }
    //mul
    public int mul(int a, int b){
        return a*b;
    }
    //div
    public int div(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        CalculatorApp obj = new CalculatorApp();
        int add =obj.Add(6,7);
        System.out.println("addition of two numbers : "+add);
        int sub =obj.sub(18,3);
        System.out.println("subtraction of two numbers : "+sub);
        int mul =obj.mul(2,15);
        System.out.println("multiplication of two numbers : " +mul);
        int div =obj.div(444444,2);
        System.out.println("division of two numbers : "+div);
    }
}
