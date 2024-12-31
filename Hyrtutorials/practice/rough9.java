package Hyrtutorials.practice;

import java.util.Arrays;

public class rough9 {
    public static void main(String[] args) {
        String command="G()(al)";
        String s="";
        String[] arr=command.split("");
        System.out.println(Arrays.toString(arr));

        for(int i =0;i<arr.length;i++){
            char ch=arr[i].charAt(0);
            char s1='o';
            if((ch<='z' && ch>='a')||(ch>='A' && ch<='Z') ){
                s+=ch;
            }else{
                if(i<arr.length-1){
                    char ch1=arr[i].charAt(0);
                    char ch2=arr[i+1].charAt(0);
                    if(ch1=='(' && ch2==')'){
                        s+=s1;
                    }
                }
            }
        }
        System.out.println(s);
    }
}
