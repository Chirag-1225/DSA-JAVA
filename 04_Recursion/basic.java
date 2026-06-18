public class basic {
    public static void main(String[] args) {
        print(0);
    }

    public static void print(int cnt){
        if(cnt == 3){
            return;
        }
        System.out.println(cnt);
        print(cnt+1);
    }
}