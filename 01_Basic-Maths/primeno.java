package Basic;
import java.util.*;
public class primeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        if(n<=1){
            System.out.println("not prime");
        }else{
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                }
            }
            
        }
        if(count==0){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
        sc.close();
    }
}
