package kunal_kushwaha.dsa.dsa.maths_for_dsa.practice1.bitwise_operators;

// Given an array of n elements all elements except one contain duplicates Return the element
// which is unique or has no duplicate

public class FindUniqueWithXOR {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,1,2,1,3,6,4};
        int unique1 = findUnique(nums1);
        System.out.println(unique1);
    }

    static int findUnique(int[] nums){
        int unique = 0;
        for (int num : nums) {
            unique ^= num;
        }
        return unique;
    }
}
