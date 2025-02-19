package leetCode;

import java.util.Stack;

//682. Baseball GameExample 1:
//
//Input: ops = ["5","2","C","D","+"]
//Output: 30
//Explanation:
//        "5" - Add 5 to the record, record is now [5].
//        "2" - Add 2 to the record, record is now [5, 2].
//        "C" - Invalidate and remove the previous score, record is now [5].
//        "D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//        "+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//The total sum is 5 + 10 + 15 = 30.
//Example 2:
//
//Input: ops = ["5","-2","4","C","D","9","+","+"]
//Output: 27
//Explanation:
//        "5" - Add 5 to the record, record is now [5].
//        "-2" - Add -2 to the record, record is now [5, -2].
//        "4" - Add 4 to the record, record is now [5, -2, 4].
//        "C" - Invalidate and remove the previous score, record is now [5, -2].
//        "D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
//        "9" - Add 9 to the record, record is now [5, -2, -4, 9].
//        "+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
//        "+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
//The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
public class LC682 {
    public static void main(String[] args) {
        String[] ops={"5","-2","4","C","D","9","+","+"};
        Stack<String> s=new Stack<>();
        for(String i:ops){
            if(i=="C"){
                s.pop();
            } else if(i=="D") {
                int a=Integer.parseInt(s.peek())*2;
                s.add(a+"");
            }else if(i=="+"){
                int a=Integer.parseInt(s.peek())+Integer.parseInt(s.get(s.size()-2));
                s.add(a+"");
            }else{
                s.add(i);
            }
        }
        int res=0;
        for(String i:s){
            int a=Integer.parseInt(i);
            res+=a;

        }
        System.out.println(res);
    }
}
