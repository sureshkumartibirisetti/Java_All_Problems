package Rough;

import java.util.Arrays;

public class r9 {
    public static void main(String[] args) {
        int[] arr={1024,512,256,128,64,32,16,8,4,2,1};
        for(int i=0;i<arr.length;i++)
        {
            arr[i]+=Integer.bitCount(arr[i])*10001;
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=arr[i]%10001;
        }
        System.out.println(Arrays.toString(arr));
    }
}
