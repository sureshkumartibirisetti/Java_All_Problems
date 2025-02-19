package leetCode;
//942. DI String Match
//Example 1:
//Input: s = "IDID"
//Output: [0,4,1,3,2]
//Example 2:
//Input: s = "III"
//Output: [0,1,2,3]
//Example 3:
//Input: s = "DDI"
//Output: [3,2,0,1]

import java.util.Arrays;

public class LC942 {
    public static void main(String[] args) {
        String s="IDID";
        int[] arr=new int[s.length()+1];
        int a=0;
        int b=s.length();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I'){
                arr[i]=a;
                a++;
            }else{
                arr[i]=b;
                b--;
            }
        }
        arr[s.length()]=a;
        System.out.println(Arrays.toString(arr));
    }
}
