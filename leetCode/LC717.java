package leetCode;
/*
717. 1-bit and 2-bit Characters
Example 1:
Input: bits = [1,0,0]
Output: true
Explanation: The only way to decode it is two-bit character and one-bit character.
So the last character is one-bit character.
Example 2:
Input: bits = [1,1,1,0]
Output: false
Explanation: The only way to decode it is two-bit character and two-bit character.
So the last character is not one-bit character.
 */
public class LC717 {
    public static void main(String[] args) {
        int[] arr={0,0,0,0,0};
        if(arr[arr.length-1]==1){
            System.out.println(false);
        }
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1){
                if(arr[i]==0){
                    System.out.println(true);
                }
            }else{
                if(arr[i]==1){
                    i+=1;
                }
            }
        }
        System.out.println(false);
    }
}
