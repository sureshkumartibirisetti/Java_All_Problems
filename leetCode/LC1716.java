package leetCode;
//1716. Calculate Money in Leetcode Bank
//Example 1:
//Input: n = 4
//Output: 10
//Explanation: After the 4th day, the total is 1 + 2 + 3 + 4 = 10.
//Example 2:
//Input: n = 10
//Output: 37
//Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.
//Example 3:
//Input: n = 20
//Output: 96
//Explanation: After the 20th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4 + 5 + 6 + 7 + 8) + (3 + 4 + 5 + 6 + 7 + 8) = 96.
public class LC1716 {
    public static void main(String[] args) {
        int n=0;
        int res=0;
        if(n<=7){
            for(int i=1;i<=n;i++){
                res+=i;
            }
            System.out.println(res);
        }else{
            int temp=n%7; //6
            int t=n/7; //2
            int j=1;
            int x=0;
            while(t>0){
                res=res+(28+(x*7));
                x+=1;
                j++;
                t--;
            }
            for(int i=0;i<temp;i++){
                res+=(i+j);
            }
            System.out.println(res);

        }
    }
}
