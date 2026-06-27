public class Q08_CountEvenodd {
    public static void main(String[] args) {
        int arr[] = {25,36,74,23,21,22};
        int even = 0;
        int odd = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Even:"+even);
        System.out.println("Odd:"+odd);
    }
}
