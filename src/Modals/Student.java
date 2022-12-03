package Modals;

public class Student {
    String Name;
    String Subject;
    int Marks;
    int Age;

    public Student(String name, String subject, int marks, int age) {
        Name = name;
        Subject = subject;
        Marks = marks;
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public int getMarks() {
        return Marks;
    }

    public void setMarks(int marks) {
        Marks = marks;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
