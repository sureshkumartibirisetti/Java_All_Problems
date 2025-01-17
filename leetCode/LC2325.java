package leetCode;

import java.security.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LC2325 {
    public static void main(String[] args) {
        String key="thequickbrownfoxjumpsoverthelazydog";
        HashSet<Character> k=new HashSet<>();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String key1=key.replace(" ","");
        for(int i=0;i<key1.length();i++){
            k.add(key1.charAt(i));
        }
        Iterator<Character> iterator=k.iterator();
        String message="vkbs bs t suepuv";
        String res="";
        HashMap<Character,Character> hM=new HashMap<>(26);
        for(int i=0;i<26;i++){
            hM.put(iterator.next(),alpha.charAt(i));
        }
        for(int i=0;i<message.length();i++){
            if(message.charAt(i)==' '){
                res+=' ';
            }else{
                 res+=hM.get(message.charAt(i));
            }
        }
        System.out.println(hM);
        System.out.println(res);

    }
}
//
//        System.out.println(res);