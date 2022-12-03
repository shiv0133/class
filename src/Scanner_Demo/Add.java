package Scanner_Demo;

import java.util.Scanner;

public class Add {

    public int add(int a, int b) {

        int sum = a + b;

        return sum;
    }


    public static void main(String[] args){

        Scanner obj= new Scanner(System.in);

        System.out.println("enter value of a : ");

        int a =obj.nextInt();

        System.out.println("you have enter value of a :"+a);

        System.out.println("enter value of b : ");

        int b =obj.nextInt();

        System.out.println("you have enter value of b :"+b);

        Add m1=new Add();

        int sum =m1.add(a,b);

        System.out.println("the sum of two numbers :"+sum);

}

}