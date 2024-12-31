package InterviewProblems;
//second largest in the array
//time complexity : O(N) + O(N)
import java.util.Scanner;

public class secLargestBetterCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSIze=in.nextInt();
        int[] arr=new int[arrSIze];
        for(int i=0;i<arrSIze;i++){
            arr[i]=in.nextInt();
        }
        int flarge=arr[0];
        int slarge=-1;
        for(int i=1;i<arr.length;i++){
            if(flarge<arr[i]){
                flarge=arr[i];
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]>slarge && flarge>arr[j]){
                slarge=arr[j];
            }
        }
        System.out.println("first largest in  the array is : "+flarge);
        System.out.println("Second largest in  the array is : "+slarge);
    }
}
