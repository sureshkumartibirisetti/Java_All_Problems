package Striver.DSA.a2z.Step_3_Arrays.PlayList;

/*
input: arr={1,1,2,2,3,3,4,4}
output:4
 */
public class V_1_Q4_rmDuplicatesFromSortedArr {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,4,4};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i+=1;
            }
        }
        System.out.println(i+1);
    }
}
/*
Brute Force:-
----------------------------------------------------
HashSet<Integer> set=new HashSet<>();
        int[] arr={1,1,2,2,3,3,4,4};
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set.size());

optimal:-
-----------------------------------------------------
int[] arr={1,1,2,2,3,3,4,4};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i+=1;
            }
        }
        System.out.println(i+1);
 */
