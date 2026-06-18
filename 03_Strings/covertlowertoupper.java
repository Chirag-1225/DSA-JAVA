package Strings;

public class covertlowertoupper {
    public static void main(String[] args) {
        String str = "java";
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a'&&ch<='z'){
                ch=(char)(ch-32);
            }
            System.out.print(ch);
        }
        

    }
    
}
