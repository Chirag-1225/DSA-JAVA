public class removealpha {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(find(str));
        
    }
    public static String find(String str){
        if(str.length()==0){
            return " ";
        }
        return find(str.substring(1) + str.charAt(0));
    }
}
