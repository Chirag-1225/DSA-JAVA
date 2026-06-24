public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,9,20};
        quickSort(arr, 0, arr.length - 1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int partition(int arr[],int low ,int high,int pivot){
        int i = low -1;
        for(int j =low;j<high;j++){
           if(arr[j] < pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
          
           }
            
        }
        int wind = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = wind;
        return i+1;
    }
    public static void quickSort(int arr[], int low,int high){
        if(low >= high) {
             return;
        } 
        int p = partition(arr, low, high, arr[high]);
        quickSort(arr, low, p - 1);
        quickSort(arr, p + 1, high);
    }
    
    
}
