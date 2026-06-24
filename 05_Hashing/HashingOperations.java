

import java.util.HashMap;

public class HashingOperations {
    public static void main(String[] args) {
        int arr [] = {1,2,3,2,1,3,4};
        HashMap<Integer, Integer>map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(1, 10);
            map.put(2, 20);
            map.put(3, 30);
            map.put(1, 15);
        }
        System.out.println(map.get(1));

    }

}
