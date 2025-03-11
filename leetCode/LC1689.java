package leetCode;
//1689. Partitioning Into Minimum Number Of Deci-Binary Numbers
//Example 1:
//Input: n = "32"
//Output: 3
//Explanation: 10 + 11 + 11 = 32
//Example 2:
//Input: n = "82734"
//Output: 8
//Example 3:
//Input: n = "27346209830709182346"
//Output: 9
public class LC1689 {
    public static void main(String[] args) {
        String n="27346209830709182346";
        int max=0;
        for(char i:n.toCharArray()){
            int a=i-'0';
            if(a==9){
                max=9;
                break;
            } else if (max<a) {
                max=a;

            }
        }
        System.out.println(max);
    }
}
