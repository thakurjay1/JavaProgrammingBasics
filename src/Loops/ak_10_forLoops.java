package Loops;
import java.util.Scanner;
public class ak_10_forLoops {
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println("Hey, What's up "+i);
        }

        Scanner obj = new Scanner(System.in);

//  Factorial:-

        /*System.out.println("Enter the number");
        int n = obj.nextInt();
        int fact = 1;
        for(int i = n; i>0;i--){
            fact = fact*i;
        }
        System.out.println(fact);*/

//  Fibonacci:-
       /* System.out.println("Enter the number of digits you want to print");
        int n = obj.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println(n1);
        System.out.println(n2);
        for(int i=0;i<n-2;i++){
           int n3=n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3);
        }*/


//   Write a program to find the value of one number raised to the power other.
      /*  System.out.println("Enter the value of x ");
        int x = obj.nextInt();
        System.out.println("Enter the value of y");
        int y = obj.nextInt();
        int result = 1;
        for(int i=0;i<y;i++){
           result = result * x;
        }
        System.out.println(result);*/

//  Prime Number:-
        /*System.out.println("Enter a number");
        int no = obj.nextInt();
        boolean isPrime = true;
        for(int i =2; i<no; i++){
//      for(int i =2; i*i <=no; i++){
            if(no%i==0){
                isPrime = false;
                break;
            }
        }
        System.out.println("isPrime "+isPrime);*/

//  NOTE: If there's a factor of any number then 1 factor of any number lies between under root of that number.


//  Series Sum:-
        /*System.out.println("Enter the value of n");
        int n = obj.nextInt();
        float sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum + 1.0f/i;
        }
        System.out.println("the sum of series is "+sum);*/



//  Series Sum2:-
        System.out.println("Enter the value of n");
        int n = obj.nextInt();
        float sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2==0){
                sum = sum - 1.0f/i;
            }
            else{
                sum = sum + 1.0f/i;
            }
        }
        System.out.println("The sum of series is "+sum);

  }
    }

