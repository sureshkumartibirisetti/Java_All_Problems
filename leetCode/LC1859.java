package leetCode;

import java.util.Arrays;

public class LC1859 {
    public static void main(String[] args) {
        String inp="is2 sentence4 This1 a3";
        String[] arr=inp.split(" ");
        String[] res=new String[arr.length];
        String resStr="";
        for(int i=1;i<=arr.length;i++){
            String a="";
            for(String j:arr){
                if(j.contains(Integer.toString(i))){
                    res[i-1]=j.substring(0,j.length()-1);
                }
            }
        }
        for(String i:res){
            resStr+=i+" ";
        }
        System.out.println(resStr.trim());

    }
}
