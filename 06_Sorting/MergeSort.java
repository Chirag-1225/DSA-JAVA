public class MergeSort {

    public static void divide(int arr[], int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        divide(arr, start, mid);      // Left part
        divide(arr, mid + 1, end);    // Right part

        merge(arr, start, mid, end);
    }

    public static void merge(int arr[], int start, int mid, int end) {

        int temp[] = new int[end - start + 1];
        int k = 0;
        int i = start;
        int j = mid +1;
        while(i<=mid && j<=end){
             if(arr[i]>arr[j]){
                 temp[k] = arr[j];
                 j++;
                 k++;
             }else{
                temp[k] =arr[i];
                i++;
                k++;
             }
             
        }
        while(j <= end){
            temp[k] = arr[j];
            j++;
            k++;

        }
        while(i <= mid){
            temp[k] = arr[i];
            i++;
            k++;
        }
        for(i = 0;i<temp.length;i++){
            arr[start+i]= temp[i];
        }
        

        

        
    }

    public static void main(String[] args) {

        int arr[] = {13, 46, 24, 52, 20, 9};

        divide(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}