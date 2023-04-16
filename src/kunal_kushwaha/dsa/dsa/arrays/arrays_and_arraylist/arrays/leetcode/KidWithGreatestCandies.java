package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

public class KidWithGreatestCandies {
    public static void main(String[] args) {
        int[] candies1 = {4,2,1,1,2};
        int extraCandies1 = 1;
        List<Boolean> list1 = kidsWithCandies(candies1, extraCandies1);
        System.out.println(list1.toString());

        int[] candies2 = {12,1,12};
        int extraCandies2 = 10;
        List<Boolean> list2 = kidsWithCandies(candies2, extraCandies2);
        System.out.println(list2.toString());
    }

    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List <Boolean> list = new ArrayList<>();
        int max = 0;
        for (int i : candies){
            if (i > max){
                max = i;
            }
        }
        for (int i : candies){
            if (i + extraCandies >= max){
                list.add(true);
            }
            else {
                list.add(false);
            }
        }
        return list;
    }

}
