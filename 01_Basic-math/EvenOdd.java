package Basic;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.println("Even No.");
        }else{
            System.out.println("Odd No.");
        }
        sc.close();
    }
}
