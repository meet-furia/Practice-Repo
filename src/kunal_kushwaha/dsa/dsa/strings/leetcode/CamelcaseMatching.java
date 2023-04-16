package kunal_kushwaha.dsa.dsa.strings.leetcode;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FoBa";

        List camelMatchList = camelMatch(queries, pattern);
        System.out.println(camelMatchList);
    }

    static public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res = new ArrayList<>();

        char[] patternArr = pattern.toCharArray();
        for (String query : queries) {
            boolean isMatch = match(query.toCharArray(), patternArr);
            res.add(isMatch);
        }

        return res;
    }

    static private boolean match(char[] queryArr, char[] patternArr) {
        int j = 0;
        for (int i = 0; i < queryArr.length; i++) {
            if (j < patternArr.length && queryArr[i] == patternArr[j]) {
                j++;
            } else if (queryArr[i] >= 'A' && queryArr[i] <= 'Z') {
                return false;
            }
        }

        return j == patternArr.length;
    }
}
