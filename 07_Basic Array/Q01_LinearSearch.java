public class Q01_LinearSearch {
    public static void main(String[] args) {
        int arr[] = {34,35,42,39,43};
        int key = 34;
        int answer = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==key){
                answer = i;

            }
        
        }
        System.out.println(answer);
    }
}
