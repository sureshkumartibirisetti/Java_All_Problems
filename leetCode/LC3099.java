package leetCode;
//Input: x = 18
//
//Output: 9
//
//Explanation:
//
//The sum of digits of x is 9. 18 is divisible by 9. So 18 is a Harshad number and the answer is 9
public class LC3099 {
    public static void main(String[] args) {
        int x=20;
        int temp=x;

            int b=0;
            while(x>0){
                int rem=x%10;
                b+=rem;
                x=x/10;
            }
            if(temp%b==0){
                System.out.println(b);
            }else{
                System.out.println(-1);
            }


    }
}
