package leetCode;
//1903. Largest Odd Number in String
//Example 1:
//Input: num = "52"
//Output: "5"
//Explanation: The only non-empty substrings are "5", "2", and "52". "5" is the only odd number.
//        Example 2:
//Input: num = "4206"
//Output: ""
//Explanation: There are no odd numbers in "4206".
public class LC1903 {
    public static void main(String[] args) {
        String num="4206";
        int i=0;
        int j=num.length()-1;
        while(j>=0){
            int a=num.charAt(j)-'0';
            if(a%2!=0){
                System.out.println(num.substring(0,j+1));
                if(a<i){
                    i=a;
                }
            }
            j--;

        }
        System.out.println(i);
    }
}
