
import java.util.Arrays;
import java.util.Scanner;

public class plinedrome_Numbers {
    // ----------------------------------------------------------------------------------------------------------------------
    public static boolean isStringISPalindrome(String s) {
        // String oldstr=s;
        String newstr = "";
        char[] oldstr = s.toCharArray();
        for (int i = oldstr.length - 1; i >= 0; i--) {
            newstr += oldstr[i];
        }
        return s.equalsIgnoreCase(newstr);
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static boolean isPalindrome(int num) {
        int realNumber = num;
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return realNumber == reverse;
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static void pascalTraingle(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < (number - i); j++)
                System.out.print(" ");

            for (int j = 0; j <= i; j++) {
                System.out.print(" " +
                        (factorial(i)) / (factorial(i - j) * factorial(j)));
            }
            System.out.println();
        }
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static void pramidTraingel(int row) {
        if (row < 0)
            return;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= (row - i); j++)
                System.out.print(" ");
            for (int k = 0; k <= i; k++)
                System.out.print(" *");
            System.out.println();
        }

    }

    // ----------------------------------------------------------------------------------------------------------------------

    public static boolean AnagramString(String str1, String str2) {

        if (str1.length() == str2.length()) {
            char[] charArr1 = str1.toCharArray();
            char[] charArr2 = str2.toCharArray();
            Arrays.sort(charArr1);
            Arrays.sort(charArr2);

            boolean check = Arrays.equals(charArr1, charArr2);
            if (check)
                return true;
            else
                return false;
        }

        return false;
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static void FloydsTraingle(int row) {
        if (row < 0)
            return;
        int number = 1;
        for (int i = 1; i <= row; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }

    // ----------------------------------------------------------------------------------------------------------------------
    public static boolean isNumberIsBinary(int number) {
        int oldnumber = number;
        while (oldnumber != 0) {
            if (oldnumber % 10 > 1) {
                return false;
            }
            oldnumber /= 10;
        }
        return true;
    }

    public static void main(String[] args) {

        // FloydsTraingle(5);
        Scanner sc = new Scanner(System.in);
        // System.out.println(AnagramString("race", "care"));
        // System.out.println(AnagramString("earth", "heart"));
        // System.out.println(AnagramString("ate", "eat"));
        // System.out.println(AnagramString("ate", "eats"));

        System.out.println("Enter the number of your choice ");
        int number = sc.nextInt();
        System.out.println(isNumberIsBinary(number));
        // pramidTraingel(number);
        // System.out.println();
        // pascalTraingle(number);
        // System.out.println( factorial(number));
        // System.out.println(isPalindrome(number));
        // System.out.println("Enter the String of your choice ");
        // String s = sc.nextLine();
        // s = sc.nextLine();
        // System.out.println(isStringISPalindrome(s));

        // swaping two numbers without using third variables:
        // int a = 1324;
        // int b = 20324;

        // System.out.println("a = " + a + " \n " + " b " + b);

        // b = a + b;
        // a = b - a;
        // b = b - a;
        // System.out.println("a = " + a + " \n" + " b " + b);

    }
}
