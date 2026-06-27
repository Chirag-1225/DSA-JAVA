import java.util.HashMap;

public class Q29_unionOfTwoArrHashmap {
    public static void main(String[] args) {

        int arr1[] = {1,2,3};
        int arr2[] = {3,4,5};

        HashMap<Integer, Integer> map = new HashMap<>();

        // First array
        for(int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], 1);
        }

        // Second array
        for(int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], 1);
        }

        // Print Union
        for(int key : map.keySet()) {
            System.out.print(key + " ");
        }
    }
}