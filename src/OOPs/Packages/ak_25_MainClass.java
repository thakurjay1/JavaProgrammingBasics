package OOPs.Packages;
import java.util.*;
import OOPs.Packages.Models.*;

public class ak_25_MainClass {
    public static void main(String[] args) {

        ak_25_Students obj = new ak_25_Students("Tom");
        ak_25_Teacher teacher = new ak_25_Teacher();
        Scanner sc = new Scanner(System.in);

          //obj.name = "jay";
         //obj.getPassword();
        System.out.println(obj.getName());
    }
}



/*  Uses Of Packages:-
1- Java Package is used to categorize classes and interfaces so that they can easily maintained.
2- Java Package provides  access protection.
3- Java Package Removes Naming Collision. */

// Public Modifiers class can be accessed Everwhere.
// Default Modifiers can also be accessed in the same package.
// Private Modifiers can only be accessed in the same class.
