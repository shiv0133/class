package methods;

public class student {
    // study,eat,play

    public void study() {
        System.out.println("this is study method");
    }
    public void eat () {
        int a=10;
        int b = 20;
        int c =a+b;
        System.out.println("sum of a+b = " +c);
    }
     public void play(){
        System.out.println("this is play method");
     }

    public static void main(String[] args) {

        student obj = new student();
        obj.eat();
        obj.play();
        obj.study();

    }
}
