package GeekForGeeks;
//Examples:
//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: All the numbers from 1 to 5 are present except 4.
//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.
//Input: arr[] = [1]
//Output: 2
//Explanation: Only 1 is present so the missing element is 2.
public class Missing_in_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,5};
        int l=arr.length+1;
        int res=0;
        for(int i:arr){
            res+=i;
        }
        System.out.println((l*(l+1))/2);
        System.out.println(res);
        System.out.println(((l*(l+1))/2)-res);

    }
}
