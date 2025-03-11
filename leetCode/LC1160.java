package leetCode;

import java.util.HashMap;

/*1160. Find Words That Can Be Formed by Characters
Example 1:
Input: words = ["cat","bt","hat","tree"], chars = "atach"
Output: 6
Explanation: The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 = 6.
Example 2:
Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
Output: 10
Explanation: The strings that can be formed are "hello" and "world" so the answer is 5 + 5 = 10.
 */
public class LC1160 {
    public static void main(String[] args) {
        String[] words={"cat","bt","hat","tree"};
        String chars="atach";
        int res=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length();i++){
            map.put(chars.charAt(i),map.getOrDefault(chars.charAt(i),0)+1);
        }
        for(String i:words){
            HashMap<Character,Integer> temp=new HashMap<>();
            for(int j=0;j<i.length();j++){
                temp.put(i.charAt(j),temp.getOrDefault(i.charAt(j),0)+1);
            }
            int a=0;
            for(int j=0;j<i.length();j++){
                char ch=i.charAt(j);
                if(map.containsKey(ch) && temp.containsKey(ch)){
                    if(map.get(ch)>=temp.get(ch)){
                        a++;
                    }else{
                        a=0;
                        break;
                    }
                }else{
                    a=0;
                    break;
                }
            }
            if(a>0){
                res+=i.length();
            }
        }
        System.out.println(res);


    }
}
