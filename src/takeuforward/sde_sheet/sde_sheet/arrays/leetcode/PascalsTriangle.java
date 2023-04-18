package takeuforward.sde_sheet.sde_sheet.arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> outerList1 = generate(30);

        for (List l1 : outerList1) {
            for (Object o : l1) {
                System.out.print(o);
            }
            System.out.println();
        }
    }
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> outerList = new ArrayList<>();
        int count = 1;

        int outerStart = 1;

        ArrayList innerList;

        for (int i = 0; i < numRows; i++) {
            innerList = new ArrayList();
            for (int j = 0; j <= i; j++) {
                if (i == 0) {
                    innerList.add(1);
                    break;
                }
                if (j == 0 || j == i) {
                    innerList.add(1);
                }
                else {
                    innerList.add(outerList.get(i - 1).get(j - 1) + outerList.get(i - 1).get(j));
                }
            }
            outerList.add(innerList);
        }
        return outerList;
    }

}
