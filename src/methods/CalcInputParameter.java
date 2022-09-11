package methods;

public class CalcInputParameter {
    public void addition(int a, int b){
        int sum=a+b;
        System.out.println("Addition of two numbers :" +sum);
    }
    public void subtraction (int a, int b){
        int sub=a-b;
        System.out.println("Subtraction of two numbers :" +sub);
    }
    public void multiplication(int a, int b){
        int mul=a*b;
        System.out.println("Multiplication of two numbers :" +mul);
    }
    public void division(int a, int b){
        int div=a/b;
        System.out.println("division of two of two numbers :" +div);
    }
    public static void main(String[] args) {
        CalcInputParameter obj= new CalcInputParameter();
        obj.addition(34,12);
        obj.subtraction(33123423,333232);
        obj.multiplication(12,13);
        obj.division(222222,2);
    }
}
