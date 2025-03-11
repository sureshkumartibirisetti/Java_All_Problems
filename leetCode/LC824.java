package leetCode;
/*824. Goat Latin
Example 1:
Input: sentence = "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:
Input: sentence = "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 */
public class LC824 {
    public static void main(String[] args) {
        String s="I speak Goat Latin";
        String add="maa";
        String res="";
        String[] arr=s.split(" ");
        for(int i=0;i<arr.length;i++){
            if("aeiouAEIOU".contains(arr[i].charAt(0)+"")){
                res+=arr[i]+add+" ";
                add+="a";
            }else{
                res+=arr[i].substring(1,arr[i].length())+arr[i].charAt(0)+add+" ";
                add+="a";
            }
        }
        System.out.println(res.trim());

    }
}
