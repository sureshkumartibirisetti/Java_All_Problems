package InterviewProblems;
//search an Element in the array by using Binary Search
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= {-1,2,4,6,8,9,10,50,77};
        int target=11;
        System.out.println(search(arr,target));

    }
    static int search(int[] arr, int target) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]<target){
                low=mid+1;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }
}
