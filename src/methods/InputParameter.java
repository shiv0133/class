package methods;

public class InputParameter {

    public void hello(String Name){
        System.out.println("welcome to java :" +Name);
    }
    public void makeSquare(int Number){
        System.out.println("Square of number :" +Number*Number);
    }
    public void voting(int age){
        if (age>18){
            System.out.println("person eligible for voting " +"(Age) :" +age);
        }
        else {
            System.out.println("person not eligible for voting" +"(Age) :" +age);
        }
    }

    public static void main(String[] args) {
        InputParameter obj= new InputParameter();
        obj.hello("SHIVENDRA PRATAP SINGH");
        obj.makeSquare(14);
        obj.voting(12);
    }
}
