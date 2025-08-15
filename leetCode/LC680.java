package leetCode;
/*
680. Valid Palindrome II
Example 1:
Input: s = "aba"
Output: true
Example 2:
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
Example 3:
Input: s = "abc"
Output: false
 */
public class LC680 {
    public static void main(String[] args) {
        String s="aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        int l=s.length();
        int res=0;
        if(l==0||l==1||l==2){
            System.out.println(true);
        }else{
            int i=0;
            int j=l-1;
            while(i<j){
                if(s.charAt(i)==s.charAt(j)){
                    i++;
                    j--;
                    continue;
                }else{
                    boolean s1=ispalindrome(s,i+1,j);
                    boolean s2=ispalindrome(s,i,j-1);
                    boolean s3=s1||s2;
                    System.out.println(s3);
                    break;
                }
            }
        }
        if (res>1){
            System.out.println(false);
        }else{
            System.out.println(true);
        }

    }
    static boolean ispalindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
                continue;
            }else return false;
        }
        return true;
    }


}
