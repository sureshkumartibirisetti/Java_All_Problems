package Hyrtutorials.practice;

public class prac14 {
    public static void main(String[] args) {
        int num=11121114;
        int temp1=num;
        while(temp1>0){
            int rem=temp1%10;
            temp1=temp1/10;
            int count=0;
            int temp=num;
            while(temp>0){
                int rem1=temp%10;
                temp=temp/10;
                if(rem==rem1){
                    count++;
                }
            }
            if(count==1){
                System.out.println(rem);
            }
        }
    }
}
