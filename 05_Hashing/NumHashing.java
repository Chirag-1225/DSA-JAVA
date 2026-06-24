
import java.util.*;

public class NumHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.println("Elements of array");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int hash[] = new int[13];
        for(int i = 0;i<n;i++){
            hash[arr[i]]++;
        }
        System.out.println("No of Queries : ");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Num : ");
            int num = sc.nextInt();
            System.out.println("Freq : "+hash[num]);
            
            q--;
        }
        

        sc.close();
    }
}
