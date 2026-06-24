import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("String :");
        String str = sc.nextLine();
        int hash[] = new int[26];
        for(int i = 0;i<str.length();i++){
            hash[str.charAt(i) - 'a']++;
        }
        System.out.println("Queries :");
        int q = sc.nextInt();
        while(q>0){
            System.out.println("Character :");
            char character = sc.next().charAt(0);
            System.out.println("Freq :"+hash[character - 'a']);
            q--;
        }


        sc.close();
    }
}
