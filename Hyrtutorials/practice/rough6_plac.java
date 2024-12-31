package Hyrtutorials.practice;
//I/P: []
//O/P: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
import java.util.Arrays;
import java.util.Scanner;

public class rough6_plac {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int a=1;
        int[][] arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=a;
                a++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
