package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        List<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("papaya");
        fruits.add("papaya");
        fruits.add("Tomato");
        fruits.add("Tomato");


        //char[] chars={'a','b','c','d'};

//       for(String str:fruits){
//           System.out.println(str);
//       }
//       for (Character s: chars){
//           System.out.println(s);
//       }

        Iterator<String> iter= fruits.iterator();
       while(iter.hasNext()){
           String element= iter.next();
           System.out.println(element);
       }





    }
}
