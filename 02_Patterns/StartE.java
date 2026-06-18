package Patterns;

public class StartE {
    public static void main(String[] args) {
        int n =5;
        for(int i = 1;i<=n;i++){
            for(char j =(char)('A'+n-i);j<=+'E';j++ ){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
