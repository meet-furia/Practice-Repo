package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class DetectCapital {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'Z';
        char c3 = 'a';
        char c4 = 'z';
        System.out.println((int)c1);
        System.out.println((int)c2);
        System.out.println((int)c3);
        System.out.println((int)c4);
        String s = "ggg";
        boolean res = detectCapitalUse(s);
        System.out.println(res);
    }
    static public boolean detectCapitalUse(String word) {
        char[] wordArray = word.toCharArray();
        if ((int) word.charAt(0) >=65 && (int) word.charAt(0) <= 90){
            for (int i = 1; i < word.length(); i++){
                if ((int) word.charAt(1) >= 65 && (int) word.charAt(1) <= 90){
                    if ((int) word.charAt(i) < 65 || (int) word.charAt(i) > 90){
                        return false;
                    }
                }
                else if ((int) word.charAt(1) >= 97 && (int) word.charAt(1) <= 122){
                    if ((int) word.charAt(i) < 97 || (int) word.charAt(i) > 122){
                        return false;
                    }
                }
            }
            return true;
        }
        else if ((int) word.charAt(0) >= 97 && (int) word.charAt(0) <= 122) {
            for (int i = 1; i < word.length(); i++){
                if ((int) word.charAt(i) < 97 || (int) word.charAt(i) > 122){
                    return false;
                }
            }
            return true;
        }
        return true;
    }

}
