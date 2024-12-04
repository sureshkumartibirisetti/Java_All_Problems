package Striver.Recursion;

public class rough {
    public static void main(String[] args) {
        String s = "0p";
        System.out.println(isPalindrome(s));
    }

        static boolean isPalindrome (String s){
            s = s.toLowerCase();
            String s1 = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                    s1 = s1 + ch;
                }
            }
            System.out.println(s1);
            System.out.println(s1.length());
            if (s1.length() <= 2) {
                return true;
            }
            return func(s1, 0, s1.length());

        }
        static boolean func (String s,int i, int l){
            if (i >= l / 2) {
                return true;
            }
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
            return func(s, i + 1, l);
        }
    }


