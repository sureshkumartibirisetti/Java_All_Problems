package leetCode;

public class LC3340 {
    public static void main(String[] args) {
        String s="12345";
        int sum1=0;
        int sum2=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-'0';
            if(i%2==0){
                sum1+=a;
            }else{
                sum2+=a;
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum1==sum2);
    }
}
