package Strings;

public class ak_19_Strings {
    public static void main(String[] args) {
        /*String name = "Jay Thakur";
        String anotherName = new String("Rishabh Thakur");
        System.out.println(name);
        System.out.println(anotherName);*/
//    For code optimization use string using literals in order to reuse value from       pool area
//    Two types of area pool area and heap area.....


        /*String name1 = "Jay Thakur";
        String anotherName1 = new String("Jay Thakur");
        System.out.println(name1 ==anotherName1);*/
//     Printing false because they are not equal as new string(anotherName1) is from      heap area while String (name1) is from pool area.


//        Strings are Immutable:-
          /*String name2 = "jay Thakur";
          name2 = "Rishabh Thakur";
          System.out.println(name2);*/


//  Functions in Strings:-

        String cars = "Hyundai,Maruti,Swift,Wagnor,Ferrari,Lamborghini";
        String allCars[] = cars.split(",");
        for(String car:allCars){
            System.out.println(car);
        }

        String nonTrimmedstring = "    Jay Thakur    "; //Remove left and right gap
        String trimmedString = nonTrimmedstring.trim();
        System.out.println(trimmedString);


        String name3 = "Shrestha Thakur";
        String name4 = new String("Shrestha Thakur");
        System.out.println(name3.charAt(4));
        System.out.println(name3.length());
        System.out.println(name3.substring(2));
        System.out.println(name3.substring(2,6));
        System.out.println(name3.contains(" Thak"));
        System.out.println(name3.equals(name4));
        System.out.println(name3.isEmpty());
        System.out.println(name3.concat(" "+name4));
        System.out.println(name3 +" Sahab");
        System.out.println(name3.replace('S', 's')); //character
        System.out.println(name3.replace("tha", "ta")); //string
        System.out.println(name3.indexOf('r'));
        System.out.println(name3.lastIndexOf('r'));
        System.out.println(name3.indexOf("res"));
        System.out.println(name3.toLowerCase());
        System.out.println(name3.toUpperCase());

    }
}
