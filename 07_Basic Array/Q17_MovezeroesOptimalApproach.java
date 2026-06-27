public class Q17_MovezeroesOptimalApproach {
    public static void main(String[] args) {
        int arr[] = {2,0,2,2,0,2};
        
        int idx =0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[idx] = arr[i];
                idx++;

            }
        }
        while(idx < arr.length){
            arr[idx] = 0;
            idx++;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
