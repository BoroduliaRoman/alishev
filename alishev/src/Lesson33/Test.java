package Lesson33;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by BR 30.06.2020
 */
public class Test {
    public static void main(String[] args) {
        /////// Java 5 ///////
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(2);
        System.out.println(animal);

        ////// С появлением дженериков //////
        List<String> animals2 = new ArrayList<>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");

        String animal2 = animals2.get(1);
        //System.out.println(animal2);

        ///////// Java 7 ///////
        List<String> animals3 = new ArrayList<>();
    }
}

class Animal {

}