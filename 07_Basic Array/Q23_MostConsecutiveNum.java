public class Q23_MostConsecutiveNum {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,1};
        int count = 0;
        int value = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                if(count>value){
                    value=count;
                }
            }else if(arr[i]==0){
                count = 0;
                    
            }
            
        }
        System.out.println(value);
    }
}
