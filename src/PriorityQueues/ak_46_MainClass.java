package PriorityQueues;

import java.util.PriorityQueue;

public class ak_46_MainClass {
    public static void main(String[] args) {

        /*PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("Apple");
        pq.add("Mango");
        pq.add("Papaya");
        pq.add("Banana");
        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());*/

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();

        pq1.add(23);
        pq1.add(76);
        pq1.add(34);
        pq1.add(75);
        System.out.println(pq1);
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
        System.out.println(pq1.remove());
    }
}
