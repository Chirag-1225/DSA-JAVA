
public class removecharacter {

    public static String removeChar(String str,char target){
        if (str.length() == 0) {
            return "";
        }

        char ch = str.charAt(0);

        if (ch == target) {
            return removeChar(str.substring(1), target);
        }

        return ch + removeChar(str.substring(1), target);
    }
    public static void main(String[] args) {
       String str = "chirag"; 
       char target = 'i';
       System.out.println(removeChar(str, target));
    }
}
    
