package Animal;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Therdsak on 7/13/2016.
 */
public class Animal implements Zoo{
    HashMap<Integer,ArrayList> data_Animal = new HashMap<Integer,ArrayList>();
    private int number = 1;
    //สัตว์
    private String Id;
    private String Name;
    private String Gender;
    private String Type;



    public Animal() {

    }

    public Animal(String Id, String Type, String Name,String Gender) {
        this.Id = Id;
        this.Name = Name;
        this.Gender = Gender;
        this.Type = Type;
    }

    public void add_Animal(String a , String b , String c , String d){
        ArrayList abc = new ArrayList();
        abc.add(a);
        abc.add(b);
        abc.add(c);
        abc.add(d);
        data_Animal.put(number,abc);
        number++;
    }
    @Override
    public String toString() {

        return " AnimalId = " + Name +  " Type = " + Type + " Name = " + Name +  " Gender = " + Gender ;
    }
    public String show(Integer a) {
        ArrayList ab = data_Animal.get(a);
        return " AnimalId = " + ab.get(0) +  " Type = " + ab.get(1) + " Name = " + ab.get(2) +  " Gender = " + ab.get(3) ;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {

        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {

        Name = name;
    }

    public String getGender() {

        return Gender;
    }

    public void setGender(String gender) {

        Gender = gender;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

}









