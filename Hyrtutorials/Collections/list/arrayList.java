package Hyrtutorials.Collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> al=new ArrayList<>();
        List<Integer> al2=new ArrayList<>();
        al.add(1);
        al2.add(4);
        al.add(0,0);
        al.addAll(al2);
        System.out.println(al);
        System.out.println(al.get(0));
        al.toArray();


    }
}
