package InterviewProblems;
//count digits from the array while using hashMap
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;

public class CountDigitsUsingHash {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input size of array : ");
        int n=in.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter The Array Elements :");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the size of count digits");
        int s=in.nextInt();
        System.out.println("enter the search elemnts");
        int[] arr1=new int[s];
        for(int j=0;j<s;j++){
            arr1[j]=in.nextInt();
        }
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            hmap.put(arr[i], hmap.getOrDefault(arr[i], 0) + 1);
        }
        System.out.println("Counts of search elements:");
        for (int j = 0; j < s; j++) {
            int count = hmap.getOrDefault(arr1[j], 0);
            System.out.println(arr1[j] + " occurs " + count + " time(s)");
        }

    }
}
