package OOPs;
// There should be only public class in a file.
 class Cat{
     boolean hasFur;
     String color, breeds;
     int legs, eyes;

     public void walk(){
         System.out.println("Cat is walking");
     }
     public void eat(){
         System.out.println("cat is eating");
     }
     public void description(){
         System.out.println("My Cat has "+legs+" leg and "+ eyes+ " eyes.");
     }
}
class Dog{
     String breed, name;
     public void jump(){
         System.out.println("My dog "+ name +" having breed "+breed+ " Jumped.");
     }
     public void eat(){
         System.out.println("My dog "+ name +" having breed "+breed+ " eating food.");
     }
}
public class ak_22_MainClass {
   public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();

        cat1.legs = 3;
        cat1.eyes = 2;
        cat2.legs = 4;
        cat2.eyes = 3;

        cat1.walk();
        cat2.eat();
        cat1.description();
        cat2.description();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        dog1.name = "Tommy";
        dog1.breed = "German Shepherd";
        dog2.name = "Jacky";
        dog2.breed = "BullDog";

        dog1.jump();
        dog2.eat();
    }
}
//  Actual memory allocated for every unique Object.
//  Class doesn't take space.
//  Class is just dummy and doesn't really exist in the memory, but objects do.
