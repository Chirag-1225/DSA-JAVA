public class Q11_SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10,10,10,10,10};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
               secmax = max;
               max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secmax) {
               secmax = arr[i];
            }
        }
        System.out.println("Maximum Element: " + max);
        if(secmax == Integer.MIN_VALUE) {
            System.out.println("Second Maximum Element: -1");
        } else {
            System.out.println("Second Maximum Element: " + secmax);
        }
    }
}
