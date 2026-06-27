public class Q22_FindNoapperOnesOptimal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 2};

        int xor = 0;

        for(int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
        }

        System.out.println(xor);
    }
}
