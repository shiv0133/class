package methods;

public class Calculator {
    // add , sum , mul , div

    public void add(){
        int a =2;
        int b =21;
        int sum =a+b;
        System.out.println("sum of numbers :" +sum);
    }
    public void sub(){
        int a=23;
        int b=11;
        int sub=a-b;
        System.out.println("Sub of two numbers :" +sub);
    }
    public void div(){
        int a= 66;
        int b=22;
        int div=a/b;
        System.out.println("div of two numbers :" +div);
    }
    public void mul(){
        int a =41;
        int b =33;
        int mul =a*b;
        System.out.println("mul of two numbers :" +mul);
    }
    public void areaRectangle(){
        int length = 44;
        int breath =12;
        int area = length*breath;
        System.out.println("area of rectangle :" +area);
    }
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add();
        obj.div();
        obj.mul();
        obj.sub();
        obj.areaRectangle();
    }
}
