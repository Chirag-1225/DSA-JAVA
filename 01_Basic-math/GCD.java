package Basic;

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 18;
        
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
    static int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a% b);
    }
    static int lcm(int a , int b){
        if(b==0){
            return a;
        }
        return (a*b)/gcd(a,b);

    }
}
