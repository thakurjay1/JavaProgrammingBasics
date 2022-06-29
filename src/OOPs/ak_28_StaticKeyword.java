package OOPs;
import OOPs.ak_28_A.B;
import OOPs.ak_28_A.C;
public class ak_28_StaticKeyword {
//  Static Blocks:-
    static {
        System.out.println("In Block 1");
    }
    static {
        System.out.println("In Block 2");
    }
    public static void main(String[] args) {
        System.out.println("Inside main");

        ak_28_A objA = new ak_28_A();
        B objB = objA.new B();

        C obj = new ak_28_A.C();
    }


    static {
        System.out.println("In Block 3");
    }
}


//Static Keyword is related to class.
//If the member is static then it has only one c0py at class level.

// We cannot declare a top-level class with static modifier, but we cn declare a nested class as static.
// In java you can define a class within another class. Such a class is called nested class. Nested class are of two types : static and Non-static.

//After nesting , making class static means that nested static class can be accessed outside in a way as it is present outside not in upper class.

// There is no need to make the object of outer class during making object of nested  class when we declare nested class as static because it is associated with class and not that's much tightly coupled and we keeps it inside that outer class to maintain Encapsulation.

// Static blocks always execute before main method irrespective of written before or after main class.


// Final Conclusion is static keyword is used for Memory management.
