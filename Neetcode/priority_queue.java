package Neetcode;

import java.util.PriorityQueue;

public class priority_queue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(30);
        pq.add(10);
        pq.add(20);
        System.out.println(pq);
        int a=pq.poll();
        System.out.println(a);
        int b=pq.remove();
        System.out.println(b);
        System.out.println(pq);
    }
}
