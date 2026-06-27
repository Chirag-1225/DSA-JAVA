public class Q30_LongestSubarraySumK {
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 1, 1, 3, 2};
        int k = 3;

        int left = 0;
        int sum = 0;
        int maxLen = 0;

        for (int right = 0; right < arr.length; right++) {

            
            sum += arr[right];

            
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        System.out.println("Longest Length = " + maxLen);
    }
}
