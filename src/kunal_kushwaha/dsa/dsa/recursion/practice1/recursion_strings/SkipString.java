package kunal_kushwaha.dsa.dsa.recursion.practice1.recursion_strings;

public class SkipString {
    public static void main(String[] args) {
        String s1 = "apple123";
        String skipString1 = skipString(s1, "apple");
        System.out.println(skipString1);
    }
    static String skipString(String word, String skip) {
        if (word.isEmpty()) {
            return "";
        }
        char ch = word.charAt(0);
        if (word.startsWith("apple")) {
            return skipString(word.substring(5), skip);
        }
        else {
            return ch + skipString(word.substring(1), skip);        }
    }
}
