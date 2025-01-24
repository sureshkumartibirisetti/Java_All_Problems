package GeekForGeeks;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Input: arr = [16, 17, 4, 3, 5, 2]
//Output: [17, 5, 2]
//Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
public class Array_leaders {
    public static void main(String[] args) {
        int[] arr={16,17, 17, 4, 3, 5, 2};
        ArrayList<Integer> arrl=new ArrayList<>();
        int l=arr.length;
        int max1=arr[l-1];
        arrl.add(max1);
        for(int i=l-2;i>=0;i--){
            if(arr[i]>=max1){
                max1=arr[i];
                arrl.add(arr[i]);
            }
        }
        Collections.reverse(arrl);
        System.out.println(arrl);
    }
}
