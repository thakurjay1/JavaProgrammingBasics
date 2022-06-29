package PriorityQueues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ak_46_PQ_Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num,ber of testcases");
        int t = sc.nextInt();
        while (t-- != 0) {
            System.out.println("Enter the value of n");
            int n = sc.nextInt();
            System.out.println("Enter the value of k");
            int k = sc.nextInt();
            int a[] = new int[n];
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < n; i++) {
                if (i < k) {
                    pq.add(a[i]);
                } else {
                    if (pq.peek() < a[i]) {
                        pq.poll();
                        pq.add(a[i]);
                    }
                }
            }
            ArrayList<Integer> ans = new ArrayList<>(pq);
            Collections.sort(ans, Collections.reverseOrder());
            for(int x: ans){
                System.out.println(x+ " ");
            }
            System.out.println();
        }
    }
}

//Basically priority queue uses min heap data structure i.e; It gives priority to the minimum element in the queue.
