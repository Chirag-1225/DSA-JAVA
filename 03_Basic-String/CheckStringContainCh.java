package Strings;

public class CheckStringContainCh {
    public static void main(String[] args) {
        String str = "Hello";
        char key = 'e';
        boolean found = false;
        for(int i = 0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch == key){
            found = true;
            break;
        }
        }
        if(found){
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }
        
        
    }
    
}
