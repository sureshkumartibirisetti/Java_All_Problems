package HackerRank;

import java.util.HashMap;

/*
Sample Input 0

2
hereiamstackerrank
hackerworld
Sample Output 0

YES
NO
 */
public class HackerRank_in_a_String {
    public static void main(String[] args) {
        String s="rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt";
        HashMap<Character,Integer> map1=new HashMap<Character,Integer>(){
            {
                put('h', 1);
                put('a', 2);
                put('c', 1);
                put('k', 2);
                put('r', 2);
                put('e', 1);
                put('n',1);
            }
        };
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        System.out.println(map2);
        String s1="hackerrank";
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(map2.containsKey(ch)){
                if(map1.get(ch)<=map2.get(ch)){
                    continue;
                }else{
                    System.out.println(false);
                }
            }else{
                System.out.println(false);
            }
        }
        System.out.println(true);
    }
}
