package leetCode;

import java.util.HashMap;

//2103. Rings and Rods
//Input: rings = "B0B6G0R6R0R6G9"
//Output: 1
//Explanation:
//        - The rod labeled 0 holds 3 rings with all colors: red, green, and blue.
//        - The rod labeled 6 holds 3 rings, but it only has red and blue.
//- The rod labeled 9 holds only a green ring.
//        Thus, the number of rods with all three colors is 1.
//Input: rings = "G4"
//Output: 0
//Explanation:
//Only one ring is given. Thus, no rods have all three colors.
public class LC2103 {
    public static void main(String[] args) {
        String rings="B0B6G0R6R0R6G9";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            int a= rings.charAt(i+1)-'0';
            hm.put(rings.charAt(i),a);
        }
        System.out.println(hm);
    }
}
