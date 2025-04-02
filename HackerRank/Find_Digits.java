package HackerRank;
/*
Sample Input

2
12
1012
Sample Output

2
3
 */
public class Find_Digits {
    public static void main(String[] args) {
        int n=12;
        int temp=n;
        int c=0;
        while(n>0){
           int x=n%10;
           if(x!=0 && temp%x==0){
               c++;
           }
           n/=10;
        }
        System.out.println(c);
    }
}
