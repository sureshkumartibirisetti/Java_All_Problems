package Hyrtutorials.practice;

public class LC2108 {
    public static void main(String[] args) {
        String[] arr={"abc","car","ada","racecar","cool"};
        for(String i:arr){
            if(isPalindrome(i)){
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isPalindrome(String i){
        int l=0;
        int h=i.length()-1;
        while(l<h){
            if(i.charAt(l)!=i.charAt(h)){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
}
