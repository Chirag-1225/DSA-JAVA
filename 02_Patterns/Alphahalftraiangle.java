package Patterns;

public class Alphahalftraiangle {
    public static void main(String[] args) {
        char n = 'e';
        for (int i = 'a';i<=n;i++){
            for(int j='a';j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

    }
}
