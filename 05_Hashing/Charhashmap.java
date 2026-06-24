

import java.util.HashMap;
import java.util.Scanner;

public class Charhashmap {
        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "aabadbcc";

        HashMap<Character, Integer> mpp = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            mpp.put(character, mpp.getOrDefault(character, 0) + 1);; // if key pehle se hai to 1 lelo agr nhi hai to 0 se lelo
        }

        System.out.print("Query: ");
        int q = sc.nextInt();

        while(q > 0) {

            System.out.print("char: ");
            char ch= sc.next().charAt(0);

            System.out.println(mpp.getOrDefault(ch, 0));

            q--;
        }

        sc.close();
    }
}
