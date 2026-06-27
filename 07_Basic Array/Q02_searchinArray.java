public class Q02_searchinArray {
    public static void main(String[] args) {
        int[] arr = {12,21,32,45,34};
        int key = 45;
        
        
        System.out.println(findElement(arr, key));
    }
    public static int findElement(int[] arr,int key){
          for(int i =0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
          }
          return -1;
    }
}
