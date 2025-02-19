package leetCode;

import java.util.Arrays;

//338. Counting Bits
//Example 1:
//Input: n = 2
//Output: [0,1,1]
//Explanation:
//        0 --> 0
//        1 --> 1
//        2 --> 10
//Example 2:
//Input: n = 5
//Output: [0,1,1,2,1,2]
//Explanation:
//        0 --> 0
//        1 --> 1
//        2 --> 10
//        3 --> 11
//        4 --> 100
//        5 --> 101
public class LC338 {
    public static void main(String[] args) {
        int n=4;
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            bin(i,arr);
        }
        System.out.println(Arrays.toString(arr));
    }
    static void bin(int i,int[] arr){
        int temp=i;
        String s="";
        while(i>0){
            int temp1=i%2;
            s=temp1+s;
            i=i/2;
        }
        arr[temp]=count(s);
    }
    static int count(String s){
        int len=s.length()-1;
        int res=0;
        for(int i=0;i<=len;i++){
            if(s.charAt(i)=='1'){
                res++;
            }
        }
        return res;
    }
}
//int a=2;
//String s="";
//        while(a>0){
//int temp=a%2;
//s=temp+s;
//a=a/2;
//        }
//        System.out.println(s);