package Basic;

public class armstrong {
    public static void main(String[] args) {
        int n = 370;
        int original = n;
        int sum = 0;
        while(n>0){
        int digit = n%10;
        int num = digit*digit*digit ;
        sum = sum+num;
        n=n/10;
        }
        if(original == sum){
            System.out.println("it is armstrong no");
        }else{
            System.out.println("it is not armstrong no");
        }
    }
}
