package Methods;

public class ak_23_Introduction {
    public static void main(String[] args) {
          int firstNumber = 34;
          int secondnumber = 23;
          int result = maxOf(firstNumber, secondnumber);  //Method Calling
          System.out.println(result);
          System.out.println(maxOf(400,700));
          sayHi();
    }
    static int maxOf(int a, int b){
        //return a>b ? a : b;
        if(a>b){
            return a;
        }
        return b;
    }
    static void sayHi(){
        System.out.println("Hii\nGoodmorning!");
    }

}
