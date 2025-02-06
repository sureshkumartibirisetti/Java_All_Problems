package Rough;

import java.util.*;
class Repating_char {
    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    HashMap<Character,Integer> c=new HashMap<>();
    for(char ch:s.toCharArray()){
        c.put(ch,c.getOrDefault(ch,0)+1);
    }
    System.out.println("Repeated characters and counts");
    boolean s1=false;
    for(char key:c.keySet()){
        int count=c.get(key);
        if(count>1){
            System.out.println(key+":"+count);
            s1=true;
        }
    }
    if(!s1){
        System.out.println("No repeated characters");
    }


}
}
