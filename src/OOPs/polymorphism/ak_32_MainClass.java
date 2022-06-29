package OOPs.polymorphism;

public class ak_32_MainClass {
    public static void main(String[] args) {
        /*ak_32_Dog d = new ak_32_Dog();

        ak_32_Pet p = new ak_32_Dog();
        //ak_32_Pet p = d;
        ak_32_Animal a = new ak_32_Dog();
        //ak_32_Animal a = d;

        d.walk();
        p.walk();*/
//       a.walk(); ---->Compile time polymorphism

        greetings();
        greetings("Hey Guys!");
        greetings("Hey bro", 5);
    }
    public static void greetings(){
        System.out.println("Hii! there");
    }
    public static void greetings(String s){
        System.out.println(s);
    }
    public static void greetings(String s , int count){
        for(int i=0; i<count; i++){
            System.out.println(s);
        }
    }
}



// Run-time polymorphism is where we came to know during run-time that which function gets called. It is also known as Dynamic binding, Late binding and overriding as well, It has slower execution.
// Compile-time polymorphism is where we came to know during compile-time that which function gets called. It is also known as Static Binding, Early Binding and overloading as well, It has faster execution.

// Overriding is run-time polymorphism having same method with same parameters or signature, but associated in a class and ts subclass.
// Overloading is compile type polymorphism where more than one methods share the same name with different parameters or signature and different return type.


//only methods can be override, variable can't be override.