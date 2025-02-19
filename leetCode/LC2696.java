package leetCode;

import java.util.Stack;
import java.util.stream.StreamSupport;

//2696. Minimum String Length After Removing Substrings
//Example 1:
//Input: s = "ABFCACDB"
//Output: 2
//Explanation: We can do the following operations:
//        - Remove the substring "ABFCACDB", so s = "FCACDB".
//        - Remove the substring "FCACDB", so s = "FCAB".
//        - Remove the substring "FCAB", so s = "FC".
//        So the resulting length of the string is 2.
//It can be shown that it is the minimum length that we can obtain.
//Example 2:
//Input: s = "ACBBD"
//Output: 5
//Explanation: We cannot do any operations on the string so the length remains the same.
public class LC2696 {
    public static void main(String[] args) {
        String s = "ACBBD";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()){
                st.push(ch);
                continue;
            }else if(st.peek()=='A' && ch=='B'){
                st.pop();
            }else if(st.peek()=='C' && ch=='D'){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        System.out.println(st.size());
    }
}
