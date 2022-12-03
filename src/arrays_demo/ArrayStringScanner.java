package arrays_demo;

import java.util.Scanner;

public class ArrayStringScanner {

    public void StringScanner(){
        System.out.println("ENTER THE SIZE OF ARRAY");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        String [] cities = new String[num];

        System.out.println("ENTER THE ELEMENTS OF ARRAY");
        for(int i=0; i<=num;i++){
            cities [i]=sc.nextLine();
        }
        System.out.println("YOU HAVE ENTER THE FOLLOWING DATA");

        for(int i=0; i<=num;i++){
            System.out.println(cities[i]);
        }

    }

    public static void main(String[] args) {
        ArrayStringScanner obj=new ArrayStringScanner();
        obj.StringScanner();
    }
}
