package kunal_kushwaha.dsa.dsa_practice_1.recursion.strings;

public class RemoveA {
    public static void main(String[] args) {
        String word1 = "abacadahavcadjk";
        char letter1 = 'a';
        String removedLetter = removeLetter(word1, letter1);
        System.out.println(removedLetter);
    }
    static String removeLetter(String word, char letter) {
        if (word.isEmpty()) {
            return "";
        }
        char c = word.charAt(0);
        if (c == letter) {
            return removeLetter(word.substring(1), letter);
        }
        else {
            return c + removeLetter(word.substring(1), letter);
        }
    }
}
