package leetCode;

import java.util.Arrays;

//3248. Snake in Matrix
//Example 1:
//Input: n = 2, commands = ["RIGHT","DOWN"]
//Output: 3
//Example 2:
//Input: n = 3, commands = ["DOWN","RIGHT","UP"]
//Output: 1
public class LC3248 {
    public static void main(String[] args) {
        String[] commands={"DOWN","DOWN","DOWN","DOWN"};
        int n=5;
        int[][] arr=new int[n][n];
        int c=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=c;
                c++;
            }
        }
        int res=0;
        for(String i:commands){
            if(i=="RIGHT"){
                res+=1;
            }else if(i=="DOWN"){
                res+=10;
            }else if(i=="UP"){
                res-=10;
            }else{
                res-=1;
            }
        }
        System.out.println(res);
        int a=res/10;
        int b=res%10;
        System.out.println(a+" "+b);
        int count=(int)(1+Math.floor(Math.log10((double)(res))));
        if(count==1){
            System.out.println(arr[0][res]);
        }else{
            System.out.println(arr[res/10][res%10]);
        }
    }
}
