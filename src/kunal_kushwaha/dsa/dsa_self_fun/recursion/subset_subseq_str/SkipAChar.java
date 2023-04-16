package kunal_kushwaha.dsa.dsa_self_fun.recursion.subset_subseq_str;

public class SkipAChar {
    public static void main(String[] args) {
        String s1 = "hhahahahahhgbhj";
        String s2 = skipAChar(s1, new String(), 'a', 0);
        System.out.println(s2);

        String s3 = "haha";
        System.out.println(s3);
        s3 = replace(s3);
        System.out.println(s3);

    }
    static String skipAChar(String s, String newString, char c, int i) {
        if (i == s.length()) {
            return newString;
        }
        if (s.charAt(i) != c) {
            newString = newString + s.charAt(i);
            return skipAChar(s, newString, c , i + 1);
        }
        else {
            return skipAChar(s, newString, c, i + 1);
        }
    }
    static String replace(String s) {
        s = "Meet";
        return s;
    }
}
