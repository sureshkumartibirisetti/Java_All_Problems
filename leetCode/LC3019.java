package leetCode;

import java.util.HashSet;

//3019. Number of Changing Keys
//Input: s = "aAbBcC"
//Output: 2
//Explanation:
//From s[0] = 'a' to s[1] = 'A', there is no change of key as caps lock or shift is not counted.
//From s[1] = 'A' to s[2] = 'b', there is a change of key.
//From s[2] = 'b' to s[3] = 'B', there is no change of key as caps lock or shift is not counted.
//From s[3] = 'B' to s[4] = 'c', there is a change of key.
//From s[4] = 'c' to s[5] = 'C', there is no change of key as caps lock or shift is not counted.
public class LC3019 {
    public static void main(String[] args) {
        String s="Aaaaaab";
        String s1=s.toLowerCase();
        int l=s1.length();
        int i=0;
        int j=1;
        int count=0;
        while(i!=l && j!=l){
            if(s1.charAt(i)==s1.charAt(j)){
                j++;
            }
            else{
                count++;
                int temp=j;
                i=j;
                j=temp+1;
            }
        }
        System.out.println(count);

    }
}
