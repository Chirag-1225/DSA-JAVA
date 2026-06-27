public class Q27_rotateByKOptimal {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int k = 2;
        int n = arr.length;
        int temp[] = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k] = arr[i];
        }
        for(int i = k;i<n;i++){
            arr[i] = temp[i-k];
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
