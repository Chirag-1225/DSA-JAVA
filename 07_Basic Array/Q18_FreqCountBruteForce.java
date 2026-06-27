
public class Q18_FreqCountBruteForce {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,1,2};

        for(int i = 0; i < arr.length; i++) {

            boolean alreadyCounted = false;

            // Check if element is already counted
            for(int k = 0; k < i; k++) {
                if(arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted)
                continue;

            int count = 0;

            // Count frequency
            for(int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " : " + count);
        }

    }
}
