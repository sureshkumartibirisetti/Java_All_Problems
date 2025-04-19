package Rough;

public class abc {
    public static void main(String[] args) {
        int a=-240;
        int temp=Math.abs(a);
        int res=0;
//        while(temp>0){
//            int temp1=temp%10;
//            res=(res*10)+temp1;
//            temp/=10;
//        }
        for(int i=temp;i!=0;i/=10){
            int temp1=i%10;
            res=(res*10)+temp1;
        }
        if(a<0){
            System.out.println(res*-1);
        }else{
            System.out.println(res);
        }
    }
}
