package Striver.a2z.patterns;

public class p_19 {
    public static void main(String[] args) {
        int n=4;
        int inis=0;
        for( int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }for(int j=0;j<inis;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*");
            }
            inis+=2;
            System.out.println();
        }
        inis-=2;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<inis;j++){
                System.out.print(" ");
            }for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            inis-=2;
            System.out.println();
        }

    }
}
