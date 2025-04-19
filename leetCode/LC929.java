package leetCode;

import java.util.Arrays;
import java.util.HashSet;

/*
929. Unique Email Addresses
Example 1:
Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.
Example 2:
Input: emails = ["a@leetcode.com","b@leetcode.com","c@leetcode.com"]
Output: 3
 */
public class LC929 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        String[] emails={"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        for(String i:emails){
            String[] arr=i.split("@");
            System.out.println(Arrays.toString(arr));
            String[] arr1=arr[0].split("\\+");
            System.out.println(Arrays.toString(arr1));
            String s="";
            String[] arr2=arr1[0].split("\\.");
            System.out.println(Arrays.toString(arr2));
            for(String j:arr2){
                s+=j;
            }
            s+="@";
            s+=arr[1];
            set.add(s);
        }
        System.out.println(set.size());
    }
}
