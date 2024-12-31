package InterviewProblems;
//Largest Element in the array while using sort keyword
//time complexity: O(N log N)
import java.util.Arrays;
import java.util.Scanner;

public class largestElmtWorstCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSize=in.nextInt();
        int[] arr=new int[arrSize];
        for(int i=0;i<arrSize;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Largest Element in the array is :"+arr[arr.length-1]);
    }
}
