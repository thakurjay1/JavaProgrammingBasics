package conditionalOperators;
import java.util.Scanner;
public class ak_09_SwitchCaseStatements {
    public static void main(String[] args) {
        int dayOfWeek = 1;
        switch(dayOfWeek){
            case 1,2 :
                System.out.println("sunday");
                break;
            //case 2 :
                //System.out.println("monday");
                //break;
            case 3 :
                System.out.println("tuesday");
                break;
            case 4 :
                System.out.println("wednesday");
                break;
            case 5 :
                System.out.println("thursday");
                break;
            case 6 :
                System.out.println("friday");
                break;
            case 7 :
                System.out.println("saturday");
                break;
            default:
                System.out.println("fun day");
        }

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = obj.nextInt();
        System.out.println("Enter second number");
        int b = obj.nextInt();
        System.out.println("Enter operation");
        obj.nextLine();
        char operation = obj.nextLine().charAt(0);

        int result = 0;
        switch(operation){
            case '+' :
                result = a+b;
                break;
            case '-' :
                result = a-b;
                break;
            case '*':
                result = a*b;
                break;
            case '/':
                result = a/b;
                break;
            default:
                System.out.println("Invalid Operation");
        }
        System.out.println(result);
    }
}
