package Strings;

/*public class CountWordinSen {
    public static void main(String[] args) {
        String str = "I am";
        

        int count = 0;
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' ' || i == str.length() - 1 ){
                count++;
            }
            
        }
        System.out.println(count);
    }
}*/
/*public class CountWordinSen {
    public static void main(String[] args) {

        String str = "I am chirag saini";

        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if(ch == ' ') {
                count++;
            }

            else if(i == str.length() - 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}*/
public class CountWordinSen{
    public static void main(String[] args) {
        String str = "I am chirag"; 
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if((i == 0 || str.charAt(i - 1) == ' ')
            && str.charAt(i) != ' ') {
                count++;
            }
        }

        System.out.println(count);
    }

}
