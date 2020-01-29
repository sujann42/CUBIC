package Collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String[] args) {
        Dog d= new Dog("john", "white");
        Dog d1= new Dog("bunny", "black");

        Set<Dog> treeSet= new TreeSet<>();
        treeSet.add(d1);
        treeSet.add(d);

        Iterator<Dog> it = treeSet.iterator();
        while(it.hasNext()){
            System.out.println(it);
        }

    }
}
