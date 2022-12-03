package Scanner_Demo;

import java.util.Scanner;

public class Multiplication {

    //mul

    public int  mul(int  a, int b){

        int mul = a*b;

        return mul;
    }

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        System.out.println("please enter the value of a ");

        int a=obj.nextInt();

        System.out.println("you have enter value of a " +a);

        System.out.println("please enter the value of b ");

        int b=obj.nextInt();

        System.out.println("you have enter the value of b ");

        Multiplication m1=new Multiplication();

        int mul=m1.mul(a,b);

        System.out.println("multiplication of two numbers :" +mul);
    }


}
