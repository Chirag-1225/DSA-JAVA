package Patterns;

public class RevAlphahalftraiangle {
    public static void main(String[] args) {
        char n = 'e';
        for (int i = n;i>='a';i--){
            for(int j='a';j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }

    }
}
