package operators;

public class ak_05_Operators {
    public static void main(String[] args) {
//  Arithmetic Operator:-
        int a = 23;
        int b = 25;
        /*int c = a*a + b*b + 2*a*b;
        int  d = (a+b) * (a+b);*/

        //double c = (float)b/a;

        //int c = b%a;  //Modulo Operator

        int c = ++b;
        //int c = b++;
        System.out.println(c);
        //System.out.println(d);

//  Bitwise Operators:- first converted to bits and then perform given operations.
//  1101-->0110-->0011-->0001-->0000-->  Right shifting

        System.out.println(5&6);
        System.out.println(6|3);

        System.out.println(5>>1);  //Right Shifting 5 (1) time
        System.out.println(12<<1); //Left Shift 12 (1) time


//  Assignment Operators:-
        int x = 4;
        x+=2;   //x = x+2;


//  Comparison Operators:- Returns Boolean value.

        int i = 3;
        int j = 4;
        System.out.println(a<=b);

//  Logical Operators:- It will check only first digit in case of 0.
//       AND, OR, NOT...
//       NOT is used to reverse condition.

        int no = 102;
        if(no>=1 && no<=100){  //And Operator
            System.out.println("No lies between 1 and 100");
        }
        else{
            System.out.println("No is out of limit");
        }

    }
}
