package Strings;

public class removespaces {
    public static void main(String[] args) {
        String str = "Hello World";
        String result = "";
        for(int i = 0 ;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
            result = result+ch;
            }
        }
        System.out.println(result);
    }
}
