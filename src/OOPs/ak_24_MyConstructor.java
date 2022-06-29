package OOPs;

//  If a java constructor doesn't accept any parameters, it is a no argument     constructor.
//   When you doesn't make a constructor then your compiler will provide you a default constructor having default value.

class Vehicle{
    int wheels;
    int headlights;
    String color;

    Vehicle(){

    }

    Vehicle(int wheels){
        this.wheels = wheels;
        this.headlights = 2;
    }

    Vehicle(int wheels, String color){
        this.wheels = wheels;
        this.color = color;
        headlights = 2;
    }
}
public class ak_24_MyConstructor {

   ak_24_MyConstructor(){
       System.out.println("Object is now Created");
   }
    public static void main(String[] args) {
          ak_24_MyConstructor obj = new ak_24_MyConstructor(); //Constructor gets   called

          Vehicle train = new Vehicle();
          Vehicle car = new Vehicle(4);
          Vehicle Bus = new Vehicle(6);
          Vehicle eRichshaw = new Vehicle(3,"Yellow");

          System.out.println(car.wheels+" wheels");
          System.out.println(Bus.wheels+" wheels");
          System.out.println(car.headlights+" headlights");
          System.out.println(Bus.headlights+" headlights");
          System.out.println(eRichshaw.wheels+" wheels\n"+ eRichshaw.headlights+" headlights\n"+eRichshaw.color+"color");
    }
}

//  Prameterized constructor should be declared wghen we aware that with changing in   object its val;ue varies.
