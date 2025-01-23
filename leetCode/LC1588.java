package leetCode;
//Input: arr = [1,4,2,5,3]
//Output: 58
//Explanation: The odd-length subarrays of arr and their sums are:
//        [1] = 1
//        [4] = 4
//        [2] = 2
//        [5] = 5
//        [3] = 3
//        [1,4,2] = 7
//        [4,2,5] = 11
//        [2,5,3] = 10
//        [1,4,2,5,3] = 15
//If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58
public class LC1588 {
    public static void main(String[] args) {
        int[] arr={1,4,2,5,3};
        int res=0;
        int l=arr.length;
        for(int i=0;i<l;i++){
            int s=l-i;
            int e=i+1;
            int c=s*e;
            int t=c/2;
            if(c%2==1){
                t++;
            }
            res+=t*arr[i];
        }
        System.out.println(res);
    }
}
