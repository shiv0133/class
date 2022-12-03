package arrays_demo;

import java.util.Scanner;

public class ArrayWithScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of array");

        int num = sc.nextInt();

        int[] ages = new int[num];


        System.out.println("enter the elements");

        for (int i = 0; i < num; i++) {
            ages[i] = sc.nextInt();
        }

            System.out.println("Array elements are: ");

            for (int i = 0; i < num; i++) {
                System.out.println(ages[i]);
            }


        }
    }
