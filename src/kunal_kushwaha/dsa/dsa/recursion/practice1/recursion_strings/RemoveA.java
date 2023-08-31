package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion_strings;

public class RemoveA {
    public static void main(String[] args) {
        String s1 = "abbacca";
        String removedLetter = removeLetter(s1, 'a');
        System.out.println(removedLetter);

        String s2 = "abcd";
        s2 = s2.substring(1);
        System.out.println(s2);
        System.out.println(s2.substring(1));

        String s3 = "abacabccab";
        String removedLetter3 = removeLetterOneParameter(s3, 'a');
        System.out.println(removedLetter3);
    }
    public static String removeLetter(String s, char letter) {
        StringBuilder sb = new StringBuilder();
        return String.valueOf(removedLetter(s, sb, letter, 0));
    }

    public static StringBuilder removedLetter(String s, StringBuilder sb, char letter, int index) {
        if (index == s.length()) {
            return sb;
        }
        if (s.charAt(index) == letter) {
            return removedLetter(s, sb, letter, index+=1);
        }
        else {
            return removedLetter(s, sb.append(s.charAt(index)), letter, index+=1);
        }
    }

    public static String removeLetterOneParameter(String s, char c) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if (ch == c) {
            return removeLetterOneParameter(s.substring(1), c);
        }
        else {
            return ch + removeLetterOneParameter(s.substring(1), c);
        }
    }
}
