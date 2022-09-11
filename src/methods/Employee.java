package methods;

public class Employee {
    // work, eat sleep

    public void work(){
        System.out.println("this is work method");
    }
    public void eat(){
        System.out.println("this is eat method");
    }
    public void sleep(){
        System.out.println("this is sleep method");
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.work();
        obj.eat();
        obj.sleep();
    }
}
