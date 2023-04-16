package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class LengthOffLastWord {
    public static void main(String[] args) {
        String s1 = "Hello World";
        int lengthOfLastWord1 = lengthOfLastWord(s1);
        System.out.println(lengthOfLastWord1);

        String s2 = "luffy is still joyboy";
        int lengthOfLastWord2 = lengthOfLastWord(s2);
        System.out.println(lengthOfLastWord2);

        String s3 = "l";
        int lengthOfLastWord3 = lengthOfLastWord(s3);
        System.out.println(lengthOfLastWord3);

    }
    static public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length() - 1;

        while (i >= 0){
            if (s.charAt(i) == ' '){
                i--;
            }
            else {
                break;
            }
        }

        while (i >= 0){
            if (s.charAt(i) != ' '){
                count++;
                i--;
            }
            else {
                break;
            }
        }
        return count;
    }

}
