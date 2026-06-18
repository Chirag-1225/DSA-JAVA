package Strings;
import java.util.*;
public class Basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String gtr = "chiraa";
        //String str = sc.next();
       // String str = sc.nextLine();
        //System.out.println(str);
        String str = "chirag";
        System.out.println(str.charAt(3));
        System.out.println(str.length());
        System.out.println(str.indexOf("r"));
        System.out.println(str.compareTo(gtr));
        System.out.println(str.contains("c"));
        System.out.println(str.startsWith("chi"));
        System.out.println(str.endsWith("ag"));
        System.out.println(str.toUpperCase());
        System.out.println(str.concat(gtr));
        //for new String with same (String x = new String "chirag";)
        // String is immutable not any character at any index are not get change
        sc.close();
    }
}
