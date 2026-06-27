public class Q03_MaximumElements {
    public static void main(String[] args) {
        int[] arr = {12,32,43,11,65};
        int max = arr[0];
        for(int i=0;i<5;i++){
               if(arr[i]>max){
                max = arr[i];
                
               }
            
            
            
        }
        System.out.println(max);
    }
}
