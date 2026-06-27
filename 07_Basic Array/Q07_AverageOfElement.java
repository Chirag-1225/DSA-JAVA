public class Q07_AverageOfElement {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        float sum = 0;
        float average = 0;
        for(int i =0;i<arr.length;i++){
            sum = sum + arr[i];
            average = sum/arr.length;
        }
        System.out.println(average);
    }
    
    
}
