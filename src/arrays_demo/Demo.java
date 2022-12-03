package arrays_demo;

public class Demo {


    public void stringArray() {

        String city1 = "KANPUR";
        String city2 = "DELHI";
        String city3 = "AGRA";
        String city4 = "MUMBAI";

        // System.out.println(city1);
        //System.out.println(city2);
        //System.out.println(city3);
        //System.out.println(city4);

        String [] cities ={"AGRA", "DELHI","PUNE","MATHURA"};

        System.out.println(cities[3]);
        System.out.println(cities[2]);
        System.out.println(cities[0]);
        System.out.println(cities[1]);

        //for(int i=0; i<cities.length ;i++){
            //System.out.println(cities[i]);
        //}

        //advanced for loop

       // for(String var : cities){
           // System.out.println("PRINTING FROM ADVANCED LOOP : "+var);
       // }

   // }

   // public void intArray(){

      //  int [] marks ={34,43,65,12,23,45};
      //  for(int i=0 ; i<marks.length; i++) {
        //    System.out.println("printing marks using for loop : " +marks[i]);
        }
       // for(int var: marks){
           // System.out.println("advance loop: "+var);
      //  }
   // }

    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.stringArray();
       // obj.intArray();
    }
}
