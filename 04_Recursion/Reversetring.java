public class Reversetring {

    public static String reverse(String str) {

        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "madam";
        String original = str;
        if(original.equals(reverse(str))){
            System.out.println("palindrome");

        }else{
            System.out.println("not palindrome");
        }
        
    }
}
