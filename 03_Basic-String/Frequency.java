package Strings;

public class Frequency {
    public static void main(String[] args) {
        String str = "ababcabccabbac";
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a'){
                a++;
            }else if(ch == 'b'){
                b++;
            }else{
                c++;
            }
        }
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);
    }
}
