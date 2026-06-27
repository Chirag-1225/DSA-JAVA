public class Q09_oddEven {
    public static void main(String[] args) {
        int[] arr ={3,12,32,21,15,24};
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){

                System.out.println(10+arr[i]+" ");
            } else{
                System.out.println(2*arr[i]+" ");
            }
        }
    }
}
