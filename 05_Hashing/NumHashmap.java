package Strivers;
import java.util.*;
public class Maphashing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {1, 2, 1, 3, 2, 1, 12};

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            mpp.put(arr[i], mpp.getOrDefault(arr[i], 0) + 1); // if key pehle se hai to 1 lelo agr nhi hai to 0 se lelo
        }

        System.out.print("Query: ");
        int q = sc.nextInt();

        while(q > 0) {

            System.out.print("Num: ");
            int num = sc.nextInt();

            System.out.println(mpp.getOrDefault(num, 0));

            q--;
        }

        sc.close();
    }
}

