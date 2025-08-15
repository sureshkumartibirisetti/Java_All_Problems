package leetCode;

public class LC371 {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        String res="";
        int c=0;
        String a1=Integer.toBinaryString(a);
        String a2=Integer.toBinaryString(b);
        int maxLength = Math.max(a1.length(), a2.length());
        a1 = String.format("%" + maxLength + "s", a1).replace(' ', '0');
        a2 = String.format("%" + maxLength + "s", a2).replace(' ', '0');
        for(int i=a1.length()-1;i>=0;i--){
            if(a1.charAt(i)=='0' && a2.charAt(i)=='0'){
                if(c==0){
                    res='0'+res;
                }else{
                    res='1'+res;
                    c-=1;
                }
            }
            else if((a1.charAt(i)=='0' && a2.charAt(i)=='1')||(a1.charAt(i)=='1' && a2.charAt(i)=='0')){
                if(c==0){
                    res='1'+res;
                }else{
                    res='0'+res;

                }
            }else{
                if(c==0){
                    res='0'+res;
                    c+=1;
                }else if(c==1){
                    res='1'+res;
                }
            }

        }
        if(c==1){
            res='1'+res;
        }
        System.out.println(Integer.parseInt(res,2));


    }
}
