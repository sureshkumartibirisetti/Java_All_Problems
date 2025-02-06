package leetCode;

import java.util.ArrayList;
import java.util.HashMap;

//2215. Find the Difference of Two Array
//Input: nums1 = [1,2,3], nums2 = [2,4,6]
//Output: [[1,3],[4,6]]
//Explanation:
//For nums1, nums1[1] = 2 is present at index 0 of nums2,
//whereas nums1[0] = 1 and nums1[2] = 3 are not present in nums2.
//Therefore, answer[0] = [1,3].
//For nums2, nums2[0] = 2 is present at index 1 of nums1,
//whereas nums2[1] = 4 and nums2[2] = 6 are not present in nums2.
//Therefore, answer[1] = [4,6].
public class LC2215 {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={2,4,6};
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm1=new HashMap<>();
        int j=0;
        for(int i:nums1){
            hm.put(i,j);
            j++;
        }
        j=0;
        for(int i:nums2){
            hm1.put(i,j);
            j++;
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        ArrayList<Integer> al1=new ArrayList<>();
        ArrayList<Integer> al2=new ArrayList<>();
        for(int i: hm.keySet()){
            if(hm1.containsKey(i)){
                continue;
            }else{
                al1.add(i);
            }
        }
        for(int i: hm1.keySet()){
            if(hm.containsKey(i)){
                continue;
            }else{
                al2.add(i);
            }
        }
        res.add(al1);
        res.add(al2);
        System.out.println(res);

    }
}
