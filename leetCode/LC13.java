package leetCode;

import java.util.HashMap;

//Symbol       Value
//I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
public class LC13 {
    public static void main(String[] args) {
        String s="";
        HashMap<Character,Integer> hp=new HashMap<>();
        hp.put('I',1);
        hp.put('V',5);
        hp.put('X',10);
        hp.put('L',50);
        hp.put('C',100);
        hp.put('D',500);
        hp.put('M',1000);
        int res=0;
        for(int i=1;i<s.length();i++){
            int a=hp.get(s.charAt(i-1));
            int b=hp.get(s.charAt(i));
            if(a>=b) {
                res += a;

            }else{
                res+=b-a;
                i=i+1;
            }
        }
        if(s.length()>2) {
            if (hp.get(s.charAt(s.length() - 2)) >= hp.get(s.charAt(s.length() - 1))) {
                res += hp.get(s.charAt(s.length() - 1));
            }
        }
        System.out.println(res);

    }
}
