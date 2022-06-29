package OOPs.Inheritance;

public class ak_29_Singer extends ak_29_Person{

    public ak_29_Singer(String name){
        super(name);
        System.out.println("Inside singer constructor");
    }
    public void sing(){
        System.out.println(name+ " is singing");
    }

    public void eat(){
        System.out.println("Singer "+name+" is Eating");  //method Overriding
    }

    public static void laugh(){
        System.out.println("Singer is laughing");
    }
}
