package leetCode;

import java.util.HashMap;

/*1507. Reformat Date
Given a date string in the form Day Month Year, where:
Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
Year is in the range [1900, 2100].
Convert the date string to the format YYYY-MM-DD, where:
YYYY denotes the 4 digit year.
MM denotes the 2 digit month.
DD denotes the 2 digit day.
Example 1:
Input: date = "20th Oct 2052"
Output: "2052-10-20"
Example 2:
Input: date = "6th Jun 1933"
Output: "1933-06-06"
Example 3:
Input: date = "26th May 1960"
Output: "1960-05-26"
 */
public class LC1507 {
    public static void main(String[] args) {
        String date="6th Jun 1933";
        HashMap<String,String> map=new HashMap<>();
        //{"Jan":"01", "Feb":"02", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec":"12"};
        map.put("Jan","01");
        map.put("Feb","02");
        map.put("Mar","03");
        map.put("Apr","04");
        map.put("May","05");
        map.put("Jun","06");
        map.put("Jul","07");
        map.put("Aug","08");
        map.put("sep","09");
        map.put("Oct","10");
        map.put("Nov","11");
        map.put("Dec","12");
        String[] arr=date.split(" ");
        String res="";
        res+=arr[2];
        res+="-";
        res+=map.get(arr[1]);
        res+="-";
        if(arr[0].length()==3){
            res+="0"+arr[0].charAt(0);
        }else{
            res+=arr[0].substring(0,2);
        }
        System.out.println(res);




    }
}
