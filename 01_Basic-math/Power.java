package Basic;

public class Power {
    public static void main(String[] args) {
        int num = 2;
        int expo = 3;
        int result =1;
        for(int i = 0;i<expo;i++){
            result *= num;
        }
        System.out.println(result);
    }
}
