package leetCode;
//2678. Number of Senior Citizens
//Input: details = ["7868190130M7522","5303914400F9211","9273338290F4010"]
//Output: 2
//Explanation: The passengers at indices 0, 1, and 2 have ages 75, 92, and 40.
//Thus, there are 2 people who are over 60 years old.
//Input: details = ["1313579440F2036","2921522980M5644"]
//Output: 0
//Explanation: None of the passengers are older than 60.

public class LC2678 {
    public static void main(String[] args) {
        String[] details={"7868190130M7522","5303914400F9211","9273338290F4010"};
        int c=0;
        for(String s1:details){
            String s="";
            s+=s1.charAt(11);
            s+=s1.charAt(12);
            int a=Integer.parseInt(s);
            if(a>60){
                c++;
            }
        }
        System.out.println(c);
    }
}
