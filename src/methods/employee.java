package methods;

public class employee {
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
        employee obj = new employee();
        obj.work();
        obj.eat();
        obj.sleep();
    }
}
