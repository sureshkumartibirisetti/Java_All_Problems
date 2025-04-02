package HackerRank;

import java.util.Arrays;
import java.util.List;

/*
Designer PDF Viewer
Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
abc
Sample Output 0

9
 */
public class Designer_PDF_Viewer {
    public static void main(String[] args) {
        List<Integer> n = Arrays.asList(1, 3, 1, 3 ,1 ,4 ,1,3, 2, 5, 5, 5, 5, 5, 5, 5, 5 ,5 ,5 ,5, 5, 5, 5, 5, 5, 5);
        String s="abc";
        int c=0;
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i)-97;
            if(c<n.get(a)){
                c=n.get(a);
            }
        }
        System.out.println(c*s.length());
    }
}
