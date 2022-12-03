package Collecion;

import Modals.Student;

import java.util.ArrayList;

public class StudentClass {
    public void CreateStudentList(){

        ArrayList <Student> StudentArraylist=new ArrayList<>();

        Student student1=new Student("RAM","HINDI",56,14);
        Student student2=new Student("SHIV","ENGLISH",45,15);
        Student student3=new Student("SITA","MATHS" ,34,16);
        Student student4=new Student("RADHA","SCIENCE",46,18);

        //Adding data in array list
        StudentArraylist.add(student1);
        StudentArraylist.add(student2);
        StudentArraylist.add(student3);
        StudentArraylist.add(student4);
        System.out.println("USING SIMPLE FOR LOOP :");
for(int i=0;i<StudentArraylist.size();i++) {
    System.out.println(StudentArraylist.get(i).getName() + " " + StudentArraylist.get(i).getSubject() + " " + StudentArraylist.get(i).getMarks() + " " + StudentArraylist.get(i).getAge());
}
        System.out.println(" ");
        System.out.println("USING ADVANCE FOR LOOP ");

        for(Student var : StudentArraylist){
            System.out.println("Name : " +var.getName() +" ,Sub : " +var.getSubject() +" ,Age : " +var.getAge() +" ,Marks : " +var.getMarks() );
        }
    }

    public static void main(String[] args) {
        StudentClass obj =new StudentClass();
        obj.CreateStudentList();
    }
}
