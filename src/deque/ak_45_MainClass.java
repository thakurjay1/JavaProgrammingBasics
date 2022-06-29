package deque;

import java.util.ArrayDeque;

public class ak_45_MainClass {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.addFirst(12);
        ad.addFirst(54);
        ad.addFirst(68);
        ad.pop();
        System.out.println(ad.peek());
    }
}
