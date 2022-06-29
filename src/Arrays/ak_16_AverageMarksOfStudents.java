package Arrays;

import java.util.Scanner;

public class ak_16_AverageMarksOfStudents {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the no. of students");
        int n = obj.nextInt();

        int marks[]= new int[n];
        System.out.println("Enter the marks of students");
        for(int i=0; i<n; i++){
            marks[i] = obj.nextInt();
        }
        int avg = 0;
        for(int i=0;i<n;i++){
            avg = avg + marks[i];
        }
        avg = avg/n;
        System.out.println("The average marks are: "+ avg);
    }
}
