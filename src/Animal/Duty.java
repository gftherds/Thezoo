package Animal;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Gftherd_PC on 13/7/2559.
 */
   public class Duty extends Animal implements Staff {
    HashMap< Integer , ArrayList > data = new HashMap<Integer,ArrayList>();
    private int number = 1;
   public Duty(){

    }
    public void add_Duty(String a , String b){
        ArrayList scn = new ArrayList();
        scn.add(a);
        scn.add(b);
        data.put(number,scn);
        number++;


    }
    @Override
    public void name() {
//        ArrayList scn = new ArrayList();
//        scn.add(1,"Therdsak");
//        scn.add(2,"Kittsada");
//        scn.add(3,"Suraphong");
//        scn.add(4,"Somkeat");





    }

    @Override
    public void food() {
//        ArrayList scn = new ArrayList();
//        scn.add(1,"Meat");
//        scn.add(2,"Plant");


    }

    public String show1(Integer a) {
        ArrayList scn = data.get(a);
        return " Name = " + scn.get(0) +  " Givefood = " + scn.get(1)  ;
    }




}











