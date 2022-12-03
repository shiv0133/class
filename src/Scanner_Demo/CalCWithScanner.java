package Scanner_Demo;

import java.util.Scanner;

public class CalCWithScanner {

    //add//

    public double add(double a, double b) {

        double sum = a + b;

        return sum;
    }

    //sub//

    public double sub(double a, double b) {

        double sub = (double ) a - b;

        return sub;
    }
    // mul

    public double mul(double a, double b) {

        double mul = (double)a * b;

        return mul;
    }
        // division

    public double Divide(double a,double b){

        double result = (double) a/b;

        return result;
    }


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        CalCWithScanner obj=new CalCWithScanner();

        String flag ="Y";
        while (flag.equals("Y")) {
            System.out.println("********WELCOME TO CALCULATOR APP***********");

            System.out.println("Please enter the value of a : ");

            Double a = scanner.nextDouble();

            System.out.println("please enter the value of b : ");

            Double b = scanner.nextDouble();


            System.out.println("please enter your choice : ");
            System.out.println(" press choice 1 for addition : ");
            System.out.println(" press choice 2 for subtraction :");
            System.out.println(" press choice 3 for multiplication : ");
            System.out.println(" press choice 4 for division :");

            int choice = scanner.nextInt();

            if (choice == 1) {
                double sum = obj.add(a, b);
                System.out.println("sum of the given two numbers is : " + sum);
            } else if (choice == 2) {
                double sub = obj.sub(a, b);
                System.out.println("subtraction of two numbers is : " + sub);


            } else if (choice == 3) {
                double mul = obj.mul(a, b);
                System.out.println("multiplication of two numbers is: " + mul);

            } else if (choice == 4) {
                double division = obj.Divide(a, b);
                System.out.println("Division of two numbers is : " + division);


            } else {
                System.out.println("Invalid action please press correct Choice");
            }
            System.out.println("IF YOU WANT TO EXIT PLEASE PRESS N & PRESS Y FOR CONTINUE  :");
            Scanner scanner1=new Scanner(System.in);
            flag=scanner1.nextLine();

        }


    }
}