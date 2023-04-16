package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {

        String s1 = "Let's take LeetCode contest";
        String reversed = reverseWords(s1);
        System.out.println(reversed);

        String s2 = "contest";
        String reversed2 = reverseWords(s2);
        System.out.println(reversed2);

    }

    static public String reverseWords(String s) {
        String[] reversedStringArray = s.split(" ");
        StringBuilder reversed = new StringBuilder();
        int length = 1;
        for (String s1 : reversedStringArray){
            for (int i = s1.length() - 1; i >= 0; i--){
                reversed = reversed.append(s1.charAt(i));
            }
            if (length < reversedStringArray.length){
                reversed.append(" ");
                length++;
            }
        }
        return reversed.toString();
    }
}
