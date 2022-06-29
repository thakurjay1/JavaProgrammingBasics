package OOPs.FinalKeyword;

public class ak_34_MainClass extends ak_34_Student {
    // Cannot Override Final Method From Student Class.
    /*public void getDescription(){
        System.out.println("Inside main class");
    }*/


   final int ROLL_NO = 12;  //Initializing final variable is must.
    public static void main(String[] args) {
         final String NAME = "Jay Thakur" ;  //Local variable could or couldn't be initialized.


        ak_34_MainClass obj = new ak_34_MainClass();
        obj.getDescription();

    }
}



// Final Variable can't be changed.
// Final Method can't be Override.
// Final Class can't be Inherit.
