package Hyrtutorials.practice;

import java.util.*;

public class gradingScale {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);
        int s = arr.size();
        int p = 0;
        int n = 0;
        int z = 0;
        for (int i = 0; i < arr.size(); i++) {
            int a = arr.get(i);
            if (a > 0) {
                p++;
            } else if (0 > a) {
                n++;
            } else {
                z++;
            }
        }
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
        System.out.println(s);
        System.out.println(p / s);
        System.out.println(n / s);
        System.out.println(z / s);
    }
}
