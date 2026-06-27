public class Q13_RemoveDuplicatefromSortArray {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,4};
        int temp [] = new int[arr.length];
        temp[0] = arr[0];
        int k = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
               temp[k] = arr[i];
                k++;

            }
        }
        for(int i =0;i<k;i++){
            System.out.println(temp[i]);
        }
    }
}