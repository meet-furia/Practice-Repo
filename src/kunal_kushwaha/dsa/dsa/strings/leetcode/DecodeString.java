package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class DecodeString {
    public static void main(String[] args) {

    }

    public String decodeString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return String.valueOf(decodeBuilder(sb));
    }
    public static StringBuilder decodeBuilder(StringBuilder sb) {
//        Input: s = "3[a]2[bc]"
//        Output: "aaabcbc"
        StringBuilder decodedString = new StringBuilder();
        int i = 0;
        StringBuilder word = new StringBuilder("");
        while (i < sb.length()) {
            word = word.append(sb.charAt(i));

        }
        return decodedString;
    }


}
