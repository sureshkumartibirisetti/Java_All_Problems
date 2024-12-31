package InterviewProblems;
//Second Largest in the array in worst case
//time complexity : O(N log N) + O(N)
import java.util.Arrays;
import java.util.Scanner;

public class secLargestWorstCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSIze=in.nextInt();
        int[] arr=new int[arrSIze];
        for(int i=0;i<arrSIze;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int seclarge=-1;
        for(int i=arr.length-2;i>=0;i--){
            if(arr[arr.length-1]!=arr[i]){
                seclarge=arr[i];
                break;
            }
        }
        System.out.println("Second Largest in the array is :"+seclarge);
    }
}
