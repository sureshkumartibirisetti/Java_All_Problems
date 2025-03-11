package leetCode;
/*2264. Largest 3-Same-Digit Number in String
Example 1:
Input: num = "6777133339"
Output: "777"
Explanation: There are two distinct good integers: "777" and "333".
        "777" is the largest, so we return "777".
Example 2:
Input: num = "2300019"
Output: "000"
Explanation: "000" is the only good integer.
        Example 3:
Input: num = "42352338"
Output: ""
Explanation: No substring of length 3 consists of only one unique digit. Therefore, there are no good integers.
 */
public class LC2264 {
    public static void main(String[] args) {
        String num="1221000";
        int l=0;
        int r=1;
        String ress="";
        int max=-1,count=0;
        while(l!=num.length() && r!=num.length()){
            String res="";
            if(num.charAt(l)==num.charAt(r)){
                r++;
                count++;
                if(count==2){
                    res+=num.substring(l,r);
                }

            }else{
                int temp=r;
                l=r;
                r=temp+1;
                count=0;

            }
            if(!res.equals("")){
                int a=Integer.parseInt(res);
                if(max<a){
                    max=a;
                    ress=res;
                    res="";
                }
            }
        }
        System.out.println(ress);
    }
}
