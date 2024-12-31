package InterviewProblems;

import java.util.Scanner;

public class buyAndSell {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSIze=in.nextInt();
        int[] arr=new int[arrSIze];
        for(int i=0;i<arrSIze;i++){
            arr[i]=in.nextInt();
        }
        int profit=0;
        int buy=arr[0];
        for(var i=1;i<arr.length;i++){
            int cost=arr[i]-buy;
            profit=Math.max(cost,profit);
            buy=Math.min(buy,arr[i]);
        }
        System.out.println(profit);
    }
}
