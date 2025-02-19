package leetCode;

import java.util.ArrayList;
import java.util.List;

//728. Self Dividing Numbers
//Example 1:
//Input: left = 1, right = 22
//Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
//Example 2:
//Input: left = 47, right = 85
//Output: [48,55,66,77]
public class LC728 {
    public static void main(String[] args) {
        int left=1;
        int right=22;
        List<Integer> ls=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int a=1+(int)(Math.floor(Math.log10((double) (i))));
            if(a==1){
                ls.add(i);
            }else{
                if(selfDiv(i,a)){
                    ls.add(i);
                }
            }
        }
        System.out.println(ls);
    }
    public static boolean selfDiv(int i,int a){
        int temp=i;
        int c=0;
        while(i>0){
            int temp1=i%10;
            if(temp1==0){
                return false;
            }else{
                if(temp%temp1==0){
                    c++;
                }
            }
            i=i/10;
        }
        if(c==a){
            return true;
        }
        return false;
    }
}
