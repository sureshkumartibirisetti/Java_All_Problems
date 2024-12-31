package Hyrtutorials.Collections.list;

import java.util.Vector;

public class vectorList {
    public static void main(String[] args) {
        Vector v=new Vector();
        Vector<Integer> v1=new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        v.add(7);
        v.add(8);
        v.add(9);
        v.add(10);
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        v1.add(9);
        v1.add(10);
        v.add(11);
        System.out.println(v.capacity());
        System.out.println(v1);


    }
}
