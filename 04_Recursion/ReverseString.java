public class ReverseString {

    public static String reverse(String str) {

        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        String str = "abc";
        reverse(str);
        if(str.equals(reverse(str))){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

    }
}
