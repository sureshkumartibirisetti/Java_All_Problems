package Striver.Recursion;

import java.util.Arrays;
import java.util.TreeSet;

public class rough3
{
    public static void main(String args[])
    {
        int[] arr=new int[]{9,2,34,6,7,8,10,13,15,5};

        // Create a TreeSet of Strings
        TreeSet<Integer> t = new TreeSet<>();

        // Displaying the TreeSet (which is empty at this point)
        for(int i:arr){
            t.add(i);
        }
        System.out.println("TreeSet elements: " + t);
        System.out.println();
    }
}
