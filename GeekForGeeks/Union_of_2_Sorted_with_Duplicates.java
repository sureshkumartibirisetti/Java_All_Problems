package GeekForGeeks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
Union of 2 Sorted with Duplicates
Examples:
Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.
Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.
Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
 */
public class Union_of_2_Sorted_with_Duplicates {
    public static void main(String[] args) {
        int[] a={1,6,7,8};
        int[] b={1,2,3,6,7};
        HashSet<Integer> set=new HashSet<>();
        for(int i:a){
            set.add(i);
        }
        for(int i:b){
            set.add(i);
        }
        List<Integer> list=new ArrayList<>(set);
        System.out.println(list);
    }
}
