package Encapsulation;

public class ak_26_Student {

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() > 15){
            System.out.println("Invalid name");
        }
        else{
            this.name = name;
        }

    }



   public int getAge(){
       return age;
   }
   public void setAge(int age){
       if(age>25){
           System.out.println("You are too old to be a student in our School");
       }
       else{
           this.age = age;
       }
   }
}
