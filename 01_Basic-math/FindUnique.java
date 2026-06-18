package Basic;
import java.util.*;
public class FindUnique{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int unique = a^b^c^d^e;
        System.out.println(unique);
        sc.close();
    }
}