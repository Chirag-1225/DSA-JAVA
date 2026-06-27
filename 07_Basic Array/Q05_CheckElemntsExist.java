public class Q05_CheckElemntsExist {
    public static void main(String[] args) {
        int arr[] = {12,34,23,15,43};
        int element = 12;
        boolean found = false;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==element){
                found = true;

            }
        }
        if(found ==true){
            System.out.println("Element Exist");
        } else{
            System.out.println("Element Not Exist");
        }
    }
}
