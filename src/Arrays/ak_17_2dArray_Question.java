package Arrays;

import java.util.Scanner;

public class ak_17_2dArray_Question {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of rows");
        int rows = obj.nextInt();
        System.out.println("Enter the no. of columns");
        int cols = obj.nextInt();

        int a[][] = new int[rows][cols];
        int b[][] = new int[rows][cols];

        System.out.println("Enter array a");
        for(int i=0; i<rows; i++){   // Rows number of times
            for(int j=0; j<cols; j++){   // Column number of times
                a[i][j] = obj.nextInt();
            }
        }
        System.out.println("Enter array b");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                b[i][j] = obj.nextInt();
            }
        }

        int result[][] = new int[rows][cols];  //Result array to store sum of both arrays

        for(int i=0; i<rows; i++){
            for(int j=0;j<cols;j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result array is:");
        for(int i=0;i<rows; i++){
            for(int j=0; j<cols;j++){
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();
        }


    }
}


// For multiplication columns of first array should be equal to rows of second array.
