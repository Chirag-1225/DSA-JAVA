package Strings;

public class nonrepeated {
    public static void main(String[] args) {
        String str = "abbacc";
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
        if(a == 1){
            System.out.println("a");
        }if(b==1){
            System.out.println("b");
        }if(c==1){
            System.out.println("c");
        }else{
            System.out.println("All repeated");
        }
    }
}
