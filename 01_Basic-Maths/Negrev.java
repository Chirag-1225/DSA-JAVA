package Basic;
public class Negrev{
    public static void main(String[] args) {
        int n = -1234;
        int original = n;
        int rev = 0;
        n = Math.abs(original);
        while(n>0){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        if (original < 0){
            rev = -rev;
        }
        System.out.println(rev);
    }
}