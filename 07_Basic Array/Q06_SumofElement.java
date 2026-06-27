import java.util.*;
public class Q06_SumofElement {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int[] arr = new int[5];
       int sum =0;
       System.out.println("Array Elemrnts : ");
       for(int i = 0;i<arr.length;i++){
        arr[i] = sc.nextInt();
       }
       for(int i = 0;i<arr.length;i++){
        sum = sum + arr[i];
        
       }
       System.out.println("Sum of Array Elements : "+sum);


       sc.close(); 
    }
}
