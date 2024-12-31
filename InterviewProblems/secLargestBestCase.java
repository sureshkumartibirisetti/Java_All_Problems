package InterviewProblems;

import java.util.Scanner;

public class secLargestBestCase {
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
            if(arr[i]>flarge){
                int temp=flarge;
                flarge=arr[i];
                slarge=temp;
            }
        }
        System.out.println("first largest in  the array is : "+flarge);
        System.out.println("Second largest in  the array is : "+slarge);
    }
}
