package leetCode;

import java.util.HashMap;

/*
2283. Check if Number Has Equal Digit Count and Digit Value
Example 1:
Input: num = "1210"
Output: true
Explanation:
num[0] = '1'. The digit 0 occurs once in num.
num[1] = '2'. The digit 1 occurs twice in num.
num[2] = '1'. The digit 2 occurs once in num.
num[3] = '0'. The digit 3 occurs zero times in num.
The condition holds true for every index in "1210", so return true.
Example 2:
Input: num = "030"
Output: false
Explanation:
num[0] = '0'. The digit 0 should occur zero times, but actually occurs twice in num.
num[1] = '3'. The digit 1 should occur three times, but actually occurs zero times in num.
num[2] = '0'. The digit 2 occurs zero times in num.
The indices 0 and 1 both violate the condition, so return false.
 */
public class LC2283 {
    public static void main(String[] args) {
        String num="1210";
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<num.length();i++){
            String ch=num.charAt(i)+"";
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<num.length();i++){
            if(map.containsKey(num.charAt(i)+"")){
                if(num.charAt(i)-'0'!=map.get(num.charAt(i)+"")){
                    System.out.println("false");
                }
            }
            if(!map.containsKey(num.charAt(i)+"")){
                if(num.charAt(i)!='0'){
                    System.out.println("false");
                }
            }
        }

    }
}
