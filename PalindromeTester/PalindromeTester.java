import java.util.Scanner;

public class PalindromeTester {

    public static String RemoveNonLetters(String stringy) {
        String newStringy = new String();
        newStringy = "";
        newStringy = stringy.toLowerCase();
        newStringy = stringy.replaceAll("[^a-zA-Z0-9]", "");
        return newStringy;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What word, phrase, or sentence would you like to check? ");

        String original = in.nextLine();
        String phrase1 = original.toLowerCase();
        String phrase2 = RemoveNonLetters(phrase1);
        Character l;
        String backwards = "";

        for (int i = phrase2.length() - 1; i >= 0; i--) {

            String letter = phrase2.substring(i, i + 1);
            //System.out.print(letter);
            backwards = backwards + letter;
        }

        if (phrase2.equalsIgnoreCase(backwards)) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }

    }
}