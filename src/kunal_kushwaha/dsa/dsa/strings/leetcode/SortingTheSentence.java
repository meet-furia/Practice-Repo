package kunal_kushwaha.dsa.dsa.strings.leetcode;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class SortingTheSentence {
    public static void main(String[] args) {
        char c = '1';
        int i1 = (int) c;
        System.out.println(i1);

        String s1 = "Myself2 Me1 I4 and3";
        String s2 = sortSentence("Myself2 Me1 I4 and3");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }

    static public String sortSentence(String s) {
        HashMap hashMap = new HashMap();
        int index = 0;
        String word = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                word = "";
            }
            if (Character.isDigit(s.charAt(i))) {
                addStringToHashMap(word, Character.getNumericValue(s.charAt(i)), hashMap);
            }else if (s.charAt(i) != ' '){
                word = word + s.charAt(i);
            }
        }
        return hashMapToString(hashMap);
    }

    static void addStringToHashMap(String s, int index, HashMap hashMap) {
        hashMap.put(index, s);
        System.out.println(hashMap);
    }

    static String hashMapToString(HashMap hashMap) {
        int index = 1;
        String s = "";
        for (int i =1; i <= hashMap.size(); i++) {
            s = s + hashMap.get(i);
            if (i != hashMap.size()){
                s = s + " ";
            }
        }
        return s;
    }
}
