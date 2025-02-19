package leetCode;

import java.util.HashMap;

//3005. Count Elements With Maximum Frequency
//Example 1:
//Input: nums = [1,2,2,3,1,4]
//Output: 4
//Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
//So the number of elements in the array with maximum frequency is 4.
//Example 2:
//Input: nums = [1,2,3,4,5]
//Output: 5
//Explanation: All elements of the array have a frequency of 1 which is the maximum.
//So the number of elements in the array with maximum frequency is 5.
public class LC3005 {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4};
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max=0;
        for(int i:hm.values()){
            if(i>max){
                max=i;
            }
        }
        int res=0;
        for(int i: hm.values()){
            if(i==max){
                res+=max;
            }
        }
        System.out.println(res);

    }
}
