package kunal_kushwaha.dsa.dsa.arrays.linear_search_algorithm;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Meet Furia";
        char target = 'a';
        boolean result = linearSearchInString(name, target);
        System.out.println(result);

        char target1 = 'z';
        boolean resultWithForEach = linearSearchInStringForEach(name, target1);
        System.out.println(resultWithForEach);

        linearSearchInStringPrint(name);
    }

    static boolean linearSearchInString(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }

    static boolean linearSearchInStringForEach(String name, char target) {
        if (name.length() == 0) {
            return false;
        }
        for (char c : name.toCharArray()) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    static void linearSearchInStringPrint(String name) {
        String n = Arrays.toString(name.toCharArray());
        System.out.println(n);
    }

}
