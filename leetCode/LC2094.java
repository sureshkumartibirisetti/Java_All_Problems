package leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

/*
2094. Finding 3-Digit Even Numbers
Example 1:
Input: digits = [2,1,3,0]
Output: [102,120,130,132,210,230,302,310,312,320]
Explanation: All the possible integers that follow the requirements are in the output array.
Notice that there are no odd integers or integers with leading zeros.
Example 2:
Input: digits = [2,2,8,8,2]
Output: [222,228,282,288,822,828,882]
Explanation: The same digit can be used as many times as it appears in digits.
In this example, the digit 8 is used twice each time in 288, 828, and 882.
Example 3:
Input: digits = [3,7,5]
Output: []
Explanation: No even integers can be formed using the given digits.
 */
public class LC2094 {
    public static void main(String[] args) {
        int[] digits={2,2,8,8,2};
        int[] arr = new int[10];
        for (int d : digits) arr[d]++;
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            if (arr[i] == 0) continue;
            arr[i]--;
            for (int j = 0; j <= 9; j++) {
                if (arr[j] == 0) continue;
                arr[j]--;
                for (int k = 0; k <= 8; k += 2) {
                    if (arr[k] == 0) continue;
                    res.add(i*100 + j*10 + k);
                }
                arr[j]++;
            }
            arr[i]++;
        }
        System.out.println(res.stream().mapToInt(Integer::intValue).toArray());

    }
}
//TreeSet<Integer> set=new TreeSet<>();

//for(int i=0;i< digits.length;i++){
//for(int j=0;j< digits.length;j++){
//for(int k=0;k< digits.length;k++){
//if(i==j || j==k || i==k){
//continue;
//}
//int num=(digits[i]*100)+(digits[j]*10)+(digits[k]);
//            if(num>=100 && num%2==0){
//set.add(num);
//            }
//                    }
//                    }
//                    }
//int[] res=new int[set.size()];
//int i=0;
//for(int j:set){
//res[i]=j;
//i++;
//}
//System.out.println(Arrays.toString(res));
