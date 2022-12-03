package Scanner_Demo;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        // className obj= new className
         Scanner obj= new Scanner(System.in);
         System.out.println("Please enter your Name");
         String name =obj.nextLine();
         System.out.println("your name is : " +name);
         System.out.println("please enter your age");
         int age =obj.nextInt();
         System.out.println("your age is : " +age);
         System.out.println("please enter your salary");
         Double salary= obj.nextDouble();
         System.out.println("your salary is : "+salary);
         System.out.println("please enter your city");
         String city=obj.nextLine();
         System.out.println("your city is :" +city);
         System.out.println("please enter your pin code is");
         int pin =obj.nextInt();
         System.out.println("your pin code is : "+pin);

    }
}
