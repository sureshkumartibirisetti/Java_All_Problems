package leetCode;
/*
1694. Reformat Phone Number
Example 1:
Input: number = "1-23-45 6"
Output: "123-456"
Explanation: The digits are "123456".
Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
Step 2: There are 3 digits remaining, so put them in a single block of length 3. The 2nd block is "456".
Joining the blocks gives "123-456".
Example 2:
Input: number = "123 4-567"
Output: "123-45-67"
Explanation: The digits are "1234567".
Step 1: There are more than 4 digits, so group the next 3 digits. The 1st block is "123".
Step 2: There are 4 digits left, so split them into two blocks of length 2. The blocks are "45" and "67".
Joining the blocks gives "123-45-67".
Example 3:
Input: number = "123 4-5678"
Output: "123-456-78"
Explanation: The digits are "12345678".
Step 1: The 1st block is "123".
Step 2: The 2nd block is "456".
Step 3: There are 2 digits left, so put them in a single block of length 2. The 3rd block is "78".
Joining the blocks gives "123-456-78".
 */
public class LC1694 {
    public static void main(String[] args) {
        String number="123 4-567";
        String res="";
        for(int i=0;i<number.length();i++){
            if(number.charAt(i)>='0' && number.charAt(i)<='9'){
                res+=number.charAt(i);
            }
        }
        String final_res="";
        if(res.length()<=3){
            System.out.println(res);
        }else {
            for (int i = 0; i < res.length(); i++) {
                int temp = res.length() - i;
                if (temp==4){
                    final_res+=res.substring(i,i+2);
                    final_res+='-';
                    final_res+=res.substring(i+2,res.length());
                    i=i+4;
                }else if(temp<=3){
                    break;
                }else{
                    final_res+=res.substring(i,i+3);
                    i=i+3;
                }
            }
        }
        System.out.println(final_res);
    }
}
