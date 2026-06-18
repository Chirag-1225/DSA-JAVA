public class SumofFirstnNo {
    public static int Sum(int n){
        
         if(n==0) {
            return 0;
         }
         return n +(Sum(n-1));
         

    }
    public static void add(int n, int sum) {

        if (n == 0) {
            System.out.println(sum);
            return;
        }

        add(n - 1, sum + n);
    }
    public static void main(String[] args) {
    
        int n = 5;
        System.out.println(Sum(n));
        add(n, 0);

    }
}
