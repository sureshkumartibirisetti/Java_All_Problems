package InterviewProblems;

import java.util.ArrayList;

public class subSetWithoutRecursion {
    public static void main(String[] args) {
        int[] nums = {5, 1, 6};
        int res = 0;
        for (int i = 0; i < Math.pow(2, nums.length); i++) {
            String s = String.format("%" + nums.length + "s", Integer.toBinaryString(i)).replace(' ', '0');
            ArrayList<Integer> list = new ArrayList<>();
            int temp = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    list.add(nums[j]);
                }
            }
            System.out.println(list);
        }
    }
}
