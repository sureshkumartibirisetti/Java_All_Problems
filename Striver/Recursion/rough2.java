package Striver.Recursion;

import java.util.HashMap;
import java.util.Scanner;

public class rough2 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        Scanner in=new Scanner(System.in);
        capitalCities.put("England", "London");//1st
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");//2nd
        System.out.println("London".hashCode());
        System.out.println("Berlin".hashCode());
        System.out.println("Oslo".hashCode());
        System.out.println("Washington DC".hashCode());
        System.out.println();
        System.out.println(capitalCities);
    }
}
