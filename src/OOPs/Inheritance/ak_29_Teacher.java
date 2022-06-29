package OOPs.Inheritance;

public class ak_29_Teacher extends ak_29_Person{

    public ak_29_Teacher(String name){
        super(name);
        System.out.println("Inside teacher constructor");
    }

    public void teach(){
        System.out.println(name + " is teaching");
    }

    public void eat(){
        super.eat();
        System.out.println("Teacher "+name+" is Eating");   //Method Overriding
    }

    public static void laugh(){
        System.out.println("Teacher is laughing");
    }
}
