package arrays_demo;

import java.util.ArrayList;

public class ArrayListDemo {

    public void creatArraylist(){
   // SYNTAX: Collection Name: Object Name =new Collection Name();
        ArrayList mylist =new ArrayList();

        mylist.add("DELHI");  //0
        mylist.add(0);    //1
        mylist.add("SHIVENDRA");  //2
        mylist.add(34);   // 3
        mylist.add(12.2);   // 4



        System.out.println(mylist.get(3));
        System.out.println((mylist.get(1)));

        System.out.println();
        System.out.println("printing using for loop");

        for(int i=0; i<5 ;i++){
            System.out.println(mylist.get(i));
        }

        System.out.println();
        System.out.println("printing elements after removing");
        mylist.remove(3);
        for(int i =0; i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

       System.out.println();
        System.out.println("using advance for loop");

        for(Object var :mylist){
            System.out.println(var);

        }


    }

    public static void main(String[] args) {
        ArrayListDemo obj=new ArrayListDemo();
        obj.creatArraylist();
    }
}
