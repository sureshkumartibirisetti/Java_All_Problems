package leetCode;

import java.util.Arrays;

public class LC2160 {
    public static void main(String[] args) {
        int num=4009;
        int[] arr=new int[4];
        int i=0;
        while(num>0){
            int rem=num%10;
            arr[i]=rem;
            num=num/10;
            i++;
        }
        Arrays.sort(arr);
        int res=(arr[0]*10+arr[2])+(arr[1]*10+arr[3]);
        System.out.println(res);

    }
}
