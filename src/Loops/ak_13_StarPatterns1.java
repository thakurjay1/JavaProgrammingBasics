package Loops;
import java.util.Scanner;
public class ak_13_StarPatterns1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        /*
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         * * * * * *
         */
        /*for(int i=n; i>0; i--){
            for(int j=n;j>0;j--){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }*/




        /*       *
         **
         ***
         ****
         *****
         */
        /*for(int i=1; i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/





/*       *****
         ****
         ***
         **
         *
         */
       /* for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/





        /*       ******
         *****
         ****
         ***
         **
         *
         */
       /* for(int i=1; i<=n; i++){
            for(int j=1; j<=2*(i-1); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }*/





/*              *
               **
              ***
             ****
            *****
           ******
*/
        for(int i=1;i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
