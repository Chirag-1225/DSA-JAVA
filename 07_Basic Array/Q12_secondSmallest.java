public class Q12_secondSmallest {
    public static void main(String[] args) {
        int arr[] = {12,32,43,11,23};
        int min = Integer.MAX_VALUE;
        int secmin = Integer.MAX_VALUE; ;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                secmin = min;
                min = arr[i];
            }
            if(arr[i]>min && arr[i]<secmin){
                secmin= arr[i];
            }
        }
        System.out.println("Minimum Element:"+min);
        System.out.println("SecondMin Element:"+secmin);
    }
}
