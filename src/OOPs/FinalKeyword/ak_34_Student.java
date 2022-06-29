package OOPs.FinalKeyword;

public  class ak_34_Student {
    final int rollNo;  //Blank Final Variables
    final String name;

    {
        rollNo = 4;
    }

    public ak_34_Student() {
        name = "Jay Thakur";
    }


    public final void getDescription() {
        System.out.println("The Student name is " + name);

    }
}


