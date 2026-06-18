package Strings;

public class countupperorlowerch {
    public static void main(String[] args) {
        
    
        String str = "JaVa";
        int Uppercase = 0;
        int Lowercase = 0;
        for(int i =0;i<str.length();i++){
            char ch = (str.charAt(i));
            if(ch >= 'A' && ch<='Z' ){
               Uppercase++;
            }else{
               Lowercase++;
            }
            

        }
        System.out.println("Uppercase = "+Uppercase);
        System.out.println("Lowercase = "+Lowercase);
        

    }
}
