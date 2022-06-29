package OOPs.Inheritance;

public class ak_29_Person {
    protected String name;

    public ak_29_Person(String name){
        this.name = name;
        System.out.println("Inside Person constructor");
    }

    public void walk(){
        System.out.println(name+" is Walking");
    }
    public void eat(){
        System.out.println("Person "+name+" is Eating");
    }

    public static void laugh(){
        System.out.println("Person is laughing");
    }
}

// Protected member is only visible to its children class.
