package Scanner_Demo;

import java.util.Scanner;

public class Divide {

    public double Divide(int a,int b){

        double result = (double) a/b;

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("please enter value of a ");

        int a=scanner.nextInt();

        System.out.println("please enter value of b ");

        int b=scanner.nextInt();



        Divide obj=new Divide();

        double division =obj.Divide(a,b);

        System.out.println("Division of two numbers is : "+division);
    }
}
