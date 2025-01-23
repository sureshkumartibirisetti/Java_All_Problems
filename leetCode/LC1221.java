package leetCode;
//Input: s = "RLRRLLRLRL"
//Output: 4
//Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
public class LC1221 {
    public static void main(String[] args) {
        String s= "RLRRLLRLRL";
        int l=s.length();
        int a=0;
        int b=0;
        int count=0;
        for(int i=0;i<l;i++){
            char ch = s.charAt(i);
            if(ch=='L'){
                a++;
            }else{
                b++;
            }if(a==b){
                count++;
            }
        }
        System.out.println(count);
    }
}
