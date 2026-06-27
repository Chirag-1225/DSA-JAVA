import java.util.ArrayList;

public class Q24_FindMissingNum {
    public static void main(String[] args) {
        int arr[] = {2,4,6,10,12,16};

        ArrayList<Integer> list = new ArrayList<>();

        int s = arr[1] - arr[0];

        for(int i = 0; i < arr.length - 1; i++) {

            if((arr[i + 1] - arr[i]) == s) {

                list.add(arr[i]);

            } else {

                list.add(arr[i]);
                list.add(arr[i] + s);
            }
        }

        // Last element add karo
        list.add(arr[arr.length - 1]);

        System.out.println(list);
    }
}
