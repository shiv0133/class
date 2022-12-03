package Scanner_Demo;

import java.util.Scanner;

public class Subtraction {

    //Sub Class

    public int Sub(int a ,int b){

        int sub=a-b;

        return sub;
    }

    public static void main(String[] args) {

        Scanner obj=new Scanner(System.in);

        System.out.println("enter value of a : ");

        int a =obj.nextInt();

        System.out.println("you have enter value of a :"+a);

        System.out.println("enter value of b : ");

        int b =obj.nextInt();

        System.out.println("you have enter value of b :"+b);

        Subtraction m1=new Subtraction();

        int sub =m1.Sub(a,b);

        System.out.println("subtraction of two numbers in : " +sub);

    }
}
