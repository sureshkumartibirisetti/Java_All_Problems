package leetCode;

public class LC2810 {
    public static void main(String[] args) {
        String s="suresh";
        String res="";
        if(s.contains("i")) {
            StringBuilder sb=new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'i') {
                     sb=sb.reverse();
                }else{
                    sb.append(s.charAt(i));
                }
            }
            res+=sb;
        }else{
            System.out.println(s);
        }
        System.out.println(res);
    }
}
