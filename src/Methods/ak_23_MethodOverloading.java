package Methods;

public class ak_23_MethodOverloading {
    public static void main(String[] args) {
        System.out.println(largest(2,5));
        System.out.println(largest(2.4f,5.9f));
        System.out.println(largest(4,5,6));
    }
    static int largest(int a , int b){
        return a>b ? a: b;
    }
    static int largest(float a , float b){
        return 1;
    }
    static int largest(int a , int b,int c){
        return 8;
    }
}
