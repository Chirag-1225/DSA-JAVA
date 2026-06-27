public class Q14_RemoveDuplicateBRuteForce {
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,1,2};
        int temp[] = new int[arr.length];
        int k = 0;
    
        for(int i = 0; i < arr.length; i++) {

            boolean found = false;

            for(int j = 0; j < k; j++) {
                if(temp[j] == arr[i]) {
                   found = true;
                   break;
                }
            }
            if(!found){
                temp[k]= arr[i];
                k++;
            }
        }
        for(int i = 0;i<k;i++){
            System.out.println(temp[i]+" ");
        }
    }
}
