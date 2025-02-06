package leetCode;

import java.util.Arrays;

//Input: s = "egcfe"
//Output: "efcfe"
//Explanation: The minimum number of operations to make "egcfe" a palindrome is 1,
//and the lexicographically smallest palindrome string we can get by modifying one
//character is "efcfe", by changing 'g'.
public class LC2697 {
    public static void main(String[] args) {
        String s="abcd";
        char[] arr=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(arr[i]!=arr[j]){
                arr[i]=(char)(Math.min(arr[i],arr[j]));
                arr[j]=arr[i];
            }
            i++;
            j--;
        }
//        for(int i=0;i<s.length()/2;i++){
//            if(arr[i]!=arr[s.length()-i-1]){
//                arr[i]=(char)(Math.min(arr[i],arr[s.length()-i-1]));
//                arr[s.length() - i - 1] = arr[i];
//            }
//        }
        System.out.println(arr);


    }
}
//        String[] arr=s.split("");
//        int l=0;
//        int r=arr.length-1;
//        while(l<r){
//        if(arr[l].equals(arr[r])){
//        l++;
//        r--;
//        continue;
//        }else{
//        if(arr[l].charAt(0)>arr[r].charAt(0)){
//        arr[l]=arr[r];
//        }else{
//        arr[r]=arr[l];
//        }
//
//        }
//        }
//        String res="";
//        for(String i:arr){
//        res+=i;
//        }
//                System.out.println(res);
