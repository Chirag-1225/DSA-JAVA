package Strings;

public class FindOccurence {
    public static void main(String[] args) {
        String str = "banana";
        char key = 'a';
        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==key){
                count++;
            }
        }
        System.out.println(count);
    }
}
