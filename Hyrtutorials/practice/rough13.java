package Hyrtutorials.practice;

import java.util.Scanner;

public class rough13 {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2={"a", "bc"};
        String s="";  //abc
        String s1="";  //abc
        String s2=new String("abc");
        String s3=new String("abc");
        String s4="abc";
        String s5="abc";
        for(String i:word1){
            s+=i;
        }
        for(String i:word2){
            s1+=i;
        }
//        System.out.println(s+" "+s1);
        System.out.println(s==s1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println("abc"=="abc");
//        System.out.println(s2==s3);
//        System.out.println(s4==s5);
    }

    public static class b {
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            int num=in.nextInt();
            int temp=num;
            int f=0;
            while(num>0){
                int rem=num%10;
                int mul=1;
                for(int i=1;i<=rem;i++){
                    mul*=i;
                }
                f+=mul;
                num/=10;
            }
            System.out.println(temp==f);

        }
    }
}
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.