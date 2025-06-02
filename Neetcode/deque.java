package Neetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
    }
}
