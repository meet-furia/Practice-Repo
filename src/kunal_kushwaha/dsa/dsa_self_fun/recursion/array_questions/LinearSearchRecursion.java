package kunal_kushwaha.dsa.dsa_self_fun.recursion.array_questions;

import java.util.ArrayList;

public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr1 = {1,3,2,6,8,6};
        System.out.println(linearSearchWithParam(arr1, 6, 0, new ArrayList()));

        System.out.println(linearSearchWithoutParam(arr1, 6, 0));

    }
    static ArrayList linearSearchWithParam(int[] arr, int target, int index, ArrayList list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return linearSearchWithParam(arr, target, index + 1, list);
    }

    static ArrayList linearSearchWithoutParam(int[] arr, int target, int index) {
        ArrayList arrayList = new ArrayList();

        if (index == arr.length) {
            return arrayList;
        }

        if (arr[index] == target) {
            arrayList.add(index);
        }

        ArrayList answerFromBelowCalls = linearSearchWithoutParam(arr, target, index + 1);
        arrayList.addAll(answerFromBelowCalls);
        return arrayList;


    }

}
