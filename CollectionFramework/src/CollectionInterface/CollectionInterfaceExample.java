package CollectionInterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceExample {
    public static void main(String[] args) {

        Collection<String> animals = new ArrayList<>();

        animals.add("aaa");
        animals.add("bbb");
        animals.add("ccc");
        animals.add("ddd");

        System.out.println(animals);

        System.out.println("===========");

        String[] arrayOfAnimals = new String[4];
        System.out.println(arrayOfAnimals.length);
        arrayOfAnimals[0] = "aaa";
        arrayOfAnimals[1] = "bbb";
        arrayOfAnimals[2] = "ccc";
        arrayOfAnimals[3] = "ddd";

        for(String str : arrayOfAnimals){
            System.out.println(str);
        }

    }

}
