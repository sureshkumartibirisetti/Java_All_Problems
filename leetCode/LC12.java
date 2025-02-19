package leetCode;

import java.util.HashMap;

//12. Integer to Roman
//Example 1:
//Input: num = 3749
//Output: "MMMDCCXLIX"
//Explanation:
//        3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//        700 = DCC as 500 (D) + 100 (C) + 100 (C)
//        40 = XL as 10 (X) less of 50 (L)
//        9 = IX as 1 (I) less of 10 (X)
//Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
//Example 2:
//Input: num = 58
//Output: "LVIII"
//Explanation:
//        50 = L
// 8 = VIII
//Example 3:
//Input: num = 1994
//Output: "MCMXCIV"
//Explanation:
//        1000 = M
// 900 = CM
//  90 = XC
//   4 = IV
/*
I	1
V	5
X	10
L	50
C	100
D	500
M	1000
*/
public class LC12 {
    public static void main(String[] args) {
        int nums=9;
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1000, "M");
        hm.put(900, "CM");
        hm.put(500, "D");
        hm.put(400, "CD");
        hm.put(100, "C");
        hm.put(90, "XC");
        hm.put(50, "L");
        hm.put(40, "XL");
        hm.put(10, "X");
        hm.put(9, "IX");
        hm.put(5, "V");
        hm.put(4, "IV");
        hm.put(1, "I");
        String res="";
        while(nums!=0){
            if(nums>=1000){
                nums=nums-1000;
                res+=hm.get(1000);
            } else if (nums>=900 && 1000>nums) {
                nums=nums-900;
                res+=hm.get(900);
            }else if(nums>=500){
                nums=nums-500;
                res+=hm.get(500);
            }else if (nums>=400 && 500>nums) {
                nums=nums-400;
                res+=hm.get(400);
            }else if(nums>=100){
                nums=nums-100;
                res+=hm.get(100);
            }else if (nums>=90 && 100>nums) {
                nums=nums-90;
                res+=hm.get(90);
            }else if(nums>=50){
                nums=nums-50;
                res+=hm.get(50);
            }else if (nums>=40 && 50>nums) {
                nums=nums-40;
                res+=hm.get(40);
            }else if(nums>=10){
                nums=nums-10;
                res+=hm.get(10);
            }else if (nums==9) {
                nums=nums-9;
                res+=hm.get(9);
            }else if(nums>=5){
                nums=nums-5;
                res+=hm.get(5);
            }else if(nums==4){
                nums=nums-4;
                res+=hm.get(4);
            }else if(nums>=1){
                nums=nums-1;
                res+=hm.get(1);
            }
        }
        System.out.println(res);
    }
}
