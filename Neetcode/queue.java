package Neetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        System.out.println(q);
        q.add(10);
        q.add(20);
        q.add(30);
        int a=q.remove();
        System.out.println(a);
        System.out.println(q);
        System.out.println(q.size());

    }
}
