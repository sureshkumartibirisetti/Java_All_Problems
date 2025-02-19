package leetCode;
//3168. Minimum Number of Chairs in a Waiting Room
//Example 1:
//Input: s = "EEEEEEE"
//Output: 7
//Explanation:
//After each second, a person enters the waiting room and no person leaves it. Therefore, a minimum of 7 chairs is needed.
//Example 2:
//Input: s = "ELELEEL"
//Output: 2
//Explanation:
//Let's consider that there are 2 chairs in the waiting room. The table below shows the state of the waiting room at each second.
public class LC3168 {
    public static void main(String[] args) {
        String s="ELELEEL";
        int c=0;
        int s1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                c++;
            }else{
                c--;
            }
            if(c>s1){
                s1=c;
            }
        }
        System.out.println(s1);
    }
}
