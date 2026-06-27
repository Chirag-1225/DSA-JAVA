public class Q10_CheckSorted {
    public static void main(String[] args) {

        int arr[] = {13,20,24,32,46,53};

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            System.out.println("Array Sorted");
        } else {
            System.out.println("Array Unsorted");
        }
    }
}
