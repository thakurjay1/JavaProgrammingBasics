package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ak_39_MyArrayList{
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();
        List<String> vegetables = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
//        fruits.add(23);  --> Generics
        vegetables.add("Potato");
        vegetables.add("Tomato");
        vegetables.add("Onion");

        fruits.addAll(vegetables); //Add one collection inside another collection.
        //fruits.set(1,"Banana");
        //fruits.remove(1);
        //System.out.println(fruits.get(1));
        //fruits.clear();

        /*List<String> toRemove = new ArrayList<>();
        toRemove.add("Apple");
        toRemove.add("Mango");
        fruits.removeAll(toRemove);*/

        //System.out.println(fruits.size());
        //System.out.println(fruits.contains("Orange"));
        //System.out.println(fruits.isEmpty());

        String temp[] = new String[fruits.size()];

        fruits.toArray(temp);
        for(String e: temp){
            System.out.println(e);
        }

        System.out.println(fruits);








        /*ArrayList<Integer> marks = new ArrayList<>();

        ak_39_Pair<String, Integer> p1 = new ak_39_Pair("JayThakur", 36);
        ak_39_Pair<Boolean, String> p2 = new ak_39_Pair(true, "Hello");
        p1.getDescription();
        p2.getDescription();*/
    }
}

