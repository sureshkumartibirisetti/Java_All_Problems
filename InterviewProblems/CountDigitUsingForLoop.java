package InterviewProblems;
//count the digits while using for loop
import java.util.Scanner;

public class CountDigitUsingForLoop {
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
        for(int i=0;i<arr1.length;i++){
            int cnt=0;
            for(int j=0;j<arr.length;j++){
                if(arr1[i]==arr[j]){
                    cnt++;
                }
            }
            System.out.println(arr1[i]+" count is "+cnt);
        }


    }
}
