package Basic;
public class ReverseIntegerOverflow {

    public static void main(String[] args) {

        int n = 34445556;
        int rev = 0;

        while (n != 0) {

            int digit = n % 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {

                System.out.println("Overflow occurred");
                return;
            }

            rev = rev * 10 + digit;

            n = n / 10;
        }

        System.out.println("Reversed Number: " + rev);
    }
}