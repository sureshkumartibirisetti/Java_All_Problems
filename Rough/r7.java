package Rough;

/*13. Roman to Integer
 Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
Example 1:

Input: s = "III"
Output: 3
Explanation: III = 3.
Example 2:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 3:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
*/

import java.util.HashMap;

public class r7 {

    public static void main(String[] args) {
        String s="IV";
        int res=0;
        int s1=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=s.length()-1;i>0;i--) {
            int l1=hm.get(s.charAt(i));
            int l2=hm.get(s.charAt(i-1));
            if(l1>l2){
                res+=l1-l2;
                i=i-1;
                s1+=2;
            }else{
                s1+=1;
                res+=l1;
            }

        }
        if(s1!=s.length()) {
            res += hm.get(s.charAt(0));
        }
        System.out.println(res);



    }
}