public class sumofdigit {
    public static void main(String[] args) {
        add(1234,0);
    }
    public static void add(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        add(n/10, sum+(n%10));

    }
}
