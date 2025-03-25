package Striver.DSA.a2z.Step_3_Arrays.PlayList;
/*
Input: arr={1,1,2,2,3,3,4,4,5}
output:true
 */
public class V_1_Q3_checkedIfSorted {
    public static void main(String[] args) {
        int[] arr={1,1,2,43,3,4,4,5};
        System.out.println(check(arr));
    }
    static boolean check(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(!(arr[i]>=arr[i-1])){
               return false;
            }
        }
        return true;
    }
}
