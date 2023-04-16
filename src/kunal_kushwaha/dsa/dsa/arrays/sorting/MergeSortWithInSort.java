package kunal_kushwaha.dsa.dsa.arrays.sorting;

public class MergeSortWithInSort {
    public static void main(String[] args) {
        while (true) {
            System.out.println("hahaha");
        }

//        int[] nums1 = {5,4,3,2,1};
//        nums1 = mergeSort(nums1, 0, nums1.length-1);
//        System.out.println(Arrays.toString(nums1));

    }
    static int[] mergeSort(int[] arr, int start, int end) {
        if (start > end){
            return arr;
        }
        int mid = start + (end - start)/2;
        int[] left = mergeSort(arr, start, mid - 1);
        int[] right = mergeSort(arr, mid, arr.length-1);

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] mix = new int[first.length + second.length];

        while (i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }
            else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}
