package Loops;
import java.util.Scanner;
public class ak_15_whileAndDoWhileLoops {
    public static void main(String[] args) {
// Sum of the digits of number:-
        Scanner obj = new Scanner(System.in);
        /*System.out.println("Enter the number");
        int n = obj.nextInt();
        int sum =0;
        int temp = n;
        while(temp>0){
            sum =sum + temp%10;
            temp=temp/10;
        }
        System.out.println(sum);*/

// Formula to find how many no. of digits are present in the number-> log base 10(n) + 1.
// Math.log10(n) + 1;


// Palindrome number:-
        /*System.out.println("Enter the number");
        int n = obj.nextInt();
        int temp = n;
        int result = 0;
        while(temp>0) {
            int lastDigit = temp % 10;
            result = result*10 + lastDigit ;
            temp/=10;
        }
        if(result==n){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }*/



//  Do-While loop:-

        int n =0;
        do{
            System.out.println("Hello this is jay");
        }
        while(n!=0);




    }
}