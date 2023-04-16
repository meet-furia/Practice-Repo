package kunal_kushwaha.rest.strings.questions;

public class PalindromeNumber {

    public static void main(String[] args) {
        String word1 = "Meet";
        String word2 = "saas";
        boolean result1 = palindromeByKK(word1);
        boolean result2 = palindromeByKK(word2);
        System.out.println(result1);
        System.out.println(result2);

        palindromeOrNot("Meet");
        palindromeOrNot("Saas");
    }

    static void palindromeOrNot(String word){
        int i = word.length() - 1;
        String reversedWord = "";
        while (i >= 0){
            reversedWord = reversedWord + word.charAt(i);
            i--;
        }
        if (word.equalsIgnoreCase(reversedWord)){
            System.out.println(word + " is a palindrome");
        }
        else {
            System.out.println(word + " is not a palindrome");
        }
    }

    static boolean palindromeByKK(String word){
        int start = 0;
        int end = word.length() - 1;
        while (start <= end){
            if (word.charAt(start) == word.charAt(end)){
                start++;
                end--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
