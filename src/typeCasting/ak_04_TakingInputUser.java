package typeCasting;
import java.util.Scanner;
public class ak_04_TakingInputUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  You can't take string input directly after integer variable
//  If you want to take string input from user after integer then you have to           take two string inputs
        /*System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println(x);
        System.out.println("Enter the value of y");
        double  y = sc.nextDouble();
        System.out.println(y);*/
        System.out.println("principal");
        int principal = sc.nextInt();
        System.out.println("rate");
        float rate = sc.nextFloat();
        System.out.println("time");
        int time = sc.nextInt();
        float simpleInterest = principal * rate * time / 100;
        System.out.println("The simple interest is "+ simpleInterest);




    }
}
