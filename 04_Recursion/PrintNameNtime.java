public class PrintNameNtime {
    public static void print(int n){
        String name ="Chirag";
        if(n == 5 ) return;
        
        
        System.out.println(name);
        print(n+1);
    }
    public static void main(String[] args) {
        int n = 0;
        print(n);

        
    }
}
