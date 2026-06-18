package Strings;

public class countvowels {
    public static void main(String[] args) {
        String str = "Programming";
        
        int count = 0;
        for(char i = 0;i<str.length();i++){
            char ch = Character.toLowerCase(str.charAt(i));
            if(ch == 'a'||ch == 'e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
