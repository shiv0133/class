package methods;

public class ReturnNew {
    public int cubeNumber(int number){
        int  cube = number*number*number;
        return cube;
    }
    public String checkDivision(int  marks){
        if(marks>60){
            return "Passed with 1st division";
        }
        else{
            return "passed with second division";
        }
    }

    public static void main(String[] args) {
        ReturnNew obj =new ReturnNew();
        int cube = obj.cubeNumber(13);
        System.out.println("cube of number: "+cube);
        String result =obj.checkDivision(49);
        System.out.println("divison " +result);

    }
}
