package VectorsAndStacks;
import java.util.Scanner;
import java.util.Stack;
//------------WRONG
public class ak_44_BracketsProbelmInStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Brackets you want to Enter");
        int t = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter");
        while(t--!=0){
            String s = sc.nextLine();
            Stack<Character> stack = new Stack<>();

            boolean isBalanced = true;
            for(int i=0; i<s.length(); i++) {
                char ch = s.charAt(i);
                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                    continue;
                }

                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }

                if (ch == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
                if (ch == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
                if (ch == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        isBalanced = false;
                        break;
                    }
                }
            }
                if(!stack.empty()){
                    isBalanced = false;
                }
            if(isBalanced){
                System.out.println("Balanced");
            }else{
                System.out.println("Not Balanced");
            }
        }
    }
}
