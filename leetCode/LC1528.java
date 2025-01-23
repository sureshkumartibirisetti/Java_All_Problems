package leetCode;

import java.util.Arrays;

public class LC1528 {
    public static void main(String[] args) {
        String s = "codeleet";
        char[] arr=new char[s.length()];
        int[] indices={4,5,6,7,0,2,1,3};
        for(int i=0;i<s.length();i++){
            arr[indices[i]]=s.charAt(i);
        }

        System.out.println(String.valueOf(arr));
    }
}
