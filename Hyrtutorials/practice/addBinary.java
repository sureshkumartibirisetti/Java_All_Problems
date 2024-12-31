package Hyrtutorials.practice;

public class addBinary {
    public static void main(String[] args) {
        String a="11";
        String b="111";
        StringBuilder s=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0) sum+=a.charAt(i);
            if(j>=0) sum+=b.charAt(j);
            System.out.println(sum);
            s.append(sum%2);
            carry=sum/2;
            i--;
            j--;

        }
        if(carry !=0) s.append(carry);
        System.out.println(s.reverse().toString());

    }
}
