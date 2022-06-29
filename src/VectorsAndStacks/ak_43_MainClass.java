package VectorsAndStacks;

import java.util.Stack;

public class ak_43_MainClass {
    public static void main(String[] args) throws Exception{
        ak_43_MyStack<Integer> stack = new ak_43_MyStack<>();

        stack.push(47);
        stack.push(59);
        stack.push(62);
        stack.push(31);
        int poppedItem = stack.pop();
        int peekedItem = stack.peek();
        System.out.println(poppedItem);
        System.out.println(peekedItem);
    }
}
