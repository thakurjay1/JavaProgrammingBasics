package OOPs.ExceptionHandling;

public class ak_37_MainClass {
    public static void main(String[] args) {
//        try {
//            /*int a = 5;
//            int b = 0;
//            int c = a / b;
//            System.out.println(c);*/
//
//            int a[] = new int[5];
//            a[0] = 2;
//            a[1] = 5;
//            a[2] = 7;
//            a[3] = 8;
//            a[4] = 4;
//            System.out.println(a[5]);
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage()+ " occured, please check your code.");
//        }
//        catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Index Should be in the range 0 to size of array");
//        }
//        catch(IllegalArgumentException e){
//            System.out.println("Check Your Casting");
//        }
//        finally {
//            System.out.println("Sorry for the inconvenience");
//        }
//        System.out.println("Finishing line");
        fun1();
    }

    static void fun1(){
        int a = 5;
        int b = 3;
        int c = a / b;
        System.out.println(c);

        try {
            fun2();
        }
        catch(Exception e){
            System.out.println(e.getMessage()+ " Occured");
        }
    }
    static void fun2() throws ArrayIndexOutOfBoundsException{
        boolean isDanger = true;
        if(isDanger){
            throw new ArrayIndexOutOfBoundsException("Danger Here");
        }
    }
}
