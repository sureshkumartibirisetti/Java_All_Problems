package Neetcode;

import java.util.ArrayList;

//Input: arr = [16, 17, 4, 3, 5, 2]
//Output: [17, 5, 2]
//Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.
//Input: arr = [10, 4, 2, 4, 1]
//Output: [10, 4, 4, 1]
//Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side
public class rough {
    public static void main(String[] args) {
        int[] arr={10, 4, 2, 4, 1};
        ArrayList<Integer> arrl=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
            int num=arr[i];
            int max_num=0;
            for(int j=i+1;j<arr.length;j++){
                if(max_num<=arr[j]){
                    max_num=arr[j];
                }
            }
            if(num>=max_num){
                arrl.add(num);
            }
        }
        arrl.add(arr[arr.length-1]);
        System.out.println(arrl);
    }
}
