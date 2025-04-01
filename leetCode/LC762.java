package leetCode;
/*
762. Prime Number of Set Bits in Binary Representation
Example 1:
Input: left = 6, right = 10
Output: 4
Explanation:
6  -> 110 (2 set bits, 2 is prime)
7  -> 111 (3 set bits, 3 is prime)
8  -> 1000 (1 set bit, 1 is not prime)
9  -> 1001 (2 set bits, 2 is prime)
10 -> 1010 (2 set bits, 2 is prime)
4 numbers have a prime number of set bits.
Example 2:
Input: left = 10, right = 15
Output: 5
Explanation:
10 -> 1010 (2 set bits, 2 is prime)
11 -> 1011 (3 set bits, 3 is prime)
12 -> 1100 (2 set bits, 2 is prime)
13 -> 1101 (3 set bits, 3 is prime)
14 -> 1110 (3 set bits, 3 is prime)
15 -> 1111 (4 set bits, 4 is not prime)
5 numbers have a prime number of set bits.
 */
public class LC762 {
    public static void main(String[] args) {
        int left=6;
        int right=10;
        int count=0;
        for(int i=left;i<=right;i++){
            int a=Integer.bitCount(i);
            if(isprime(a)){
                count++;
            }
        }
        System.out.println(count);
    }
    static boolean isprime(int a){
        if(a<=1){
            return false;
        }else{
            for(int i=2;i<=Math.sqrt(a);i++){
                if(a%i==0){
                    return false;
                }
            }
        }
        return true;
    }
}
