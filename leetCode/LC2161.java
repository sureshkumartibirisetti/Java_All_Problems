package leetCode;

import java.util.ArrayList;

/*2161. Partition Array According to Given Pivot
Example 1:
Input: nums = [9,12,5,10,14,3,10], pivot = 10
Output: [9,5,3,10,10,12,14]
Explanation:
The elements 9, 5, and 3 are less than the pivot so they are on the left side of the array.
The elements 12 and 14 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [9, 5, 3] and [12, 14] are the respective orderings.
Example 2:
Input: nums = [-3,4,3,2], pivot = 2
Output: [-3,2,4,3]
Explanation:
The element -3 is less than the pivot so it is on the left side of the array.
The elements 4 and 3 are greater than the pivot so they are on the right side of the array.
The relative ordering of the elements less than and greater than pivot is also maintained. [-3] and [4, 3] are the respective orderings.
 */
public class LC2161 {
    public static void main(String[] args) {
        int[] nums={9,12,5,10,14,3,10};
        int pivot=10;
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        ArrayList<Integer> al3=new ArrayList<>();
        for(int i:nums){
            if(i<pivot){
               al1.add(i);
            }else if(i==pivot){
                al2.add(i);
            }else{
                al3.add(i);
            }
        }
        al1.addAll(al2);
        al1.addAll(al3);
        System.out.println(al1.toArray());

    }
}
