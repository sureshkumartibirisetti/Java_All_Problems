package Striver.prac.problems;
//contain duplicates Brute force approach.
public class prac3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,11};
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
        }
        if(c==0) System.out.println("Yes");
        else System.out.println("No");
    }
}
