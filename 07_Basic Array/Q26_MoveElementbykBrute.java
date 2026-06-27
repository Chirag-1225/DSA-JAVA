public class Q26_MoveElementbykBrute {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int k = 2;
        int temp = arr[0];
        for(int r = 0; r < k; r++){
            for(int i = 0;i<arr.length-1;i++){
            
                arr[i] = arr[i+1];
            }
             arr[arr.length-1] = temp;
             temp = arr[0];
        }
        
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
