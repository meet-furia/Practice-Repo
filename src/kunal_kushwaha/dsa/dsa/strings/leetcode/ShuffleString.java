package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class ShuffleString {
    public static void main(String[] args) {
        String s1 = "codeleet";
        int[] indices1 = {4,5,6,7,0,2,1,3};
        String restoredString1 = restoreString(s1, indices1);
        System.out.println(restoredString1);

        String s2 = "abc";
        int[] indices2 = {0,1,2};
        String restoredString2 = restoreString(s2, indices2);
        System.out.println(restoredString2);

        String restoredString = new String();

    }
    static public String restoreString(String s, int[] indices) {
        StringBuilder restoredString = new StringBuilder(s);
        for (int i = 0; i < indices.length; i++){
            restoredString.setCharAt(indices[i], s.charAt(i));
        }
        return restoredString.toString();
    }

}
