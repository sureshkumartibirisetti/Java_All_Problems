package InterviewProblems;
//largest element in the array
//time complexity: O(N)
import java.util.Scanner;

public class largestElmtBetterCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arrSIze=in.nextInt();
        int[] arr=new int[arrSIze];
        for(int i=0;i<arrSIze;i++){
            arr[i]=in.nextInt();
        }
        int largest=-1;
        for(int i:arr){
            if(largest<i){
                largest=i;
            }
        }
        System.out.println(largest);
    }
}
