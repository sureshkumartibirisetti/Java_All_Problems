package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

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
        int count=0;
        HashMap<Character, Set<Character>> hm=new HashMap<>();
        for(int i=0;i<rings.length();i+=2){
            char color = rings.charAt(i);
            char rod = rings.charAt(i + 1);

            hm.putIfAbsent(rod, new HashSet<>());
            hm.get(rod).add(color);
        }
        for(Set<Character> i:hm.values()){
            if(i.size()==3){
                count++;
            }

        }
        System.out.println(count);

    }
}
