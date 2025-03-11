package leetCode;
/*2399. Check Distances Between Same Letters
Example 1:
Input: s = "abaccb", distance = [1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
Output: true
Explanation:
        - 'a' appears at indices 0 and 2 so it satisfies distance[0] = 1.
        - 'b' appears at indices 1 and 5 so it satisfies distance[1] = 3.
        - 'c' appears at indices 3 and 4 so it satisfies distance[2] = 0.
Note that distance[3] = 5, but since 'd' does not appear in s, it can be ignored.
Return true because s is a well-spaced string.
Example 2:
Input: s = "aa", distance = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
Output: false
Explanation:
        - 'a' appears at indices 0 and 1 so there are zero letters between them.
Because distance[0] = 1, s is not a well-spaced string.
 */
public class LC2399 {
    public static void main(String[] args) {
        String s="abaccb";
        int[] distance={1,3,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    int a=s.charAt(i)-97;
                    if(distance[a]==(j-(i+1))){
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
