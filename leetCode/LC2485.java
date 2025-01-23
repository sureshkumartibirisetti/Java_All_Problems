package leetCode;

public class LC2485 {
    public static void main(String[] args) {
        int n=8;
        int s=0;
        for(int i=1;i<=n;i++){
            int s1=((i)*(1+i))/2;
            int s2=((n-i+1)*(i+n))/2;
            if(s1==s2){
                System.out.println(i);
                s=1;
                break;
            }
        }
        if(s!=1){
            System.out.println("-1");
        }

    }
}
