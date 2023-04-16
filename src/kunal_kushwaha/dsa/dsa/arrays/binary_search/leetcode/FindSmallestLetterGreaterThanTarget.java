package kunal_kushwaha.dsa.dsa.arrays.binary_search.leetcode;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters1 = {'c','f','j'};
        char target1 = 'a';
        char result1 = nextGreatestLetter(letters1, target1);
        System.out.println(result1);

        char[] letters2 = {'c','f','j'};
        char target2 = 'j';
        char result2 = nextGreatestLetter(letters2, target2);
        System.out.println(result2);

        char[] letters3 = {'c','f','j'};
        char target3 = 'k';
        char result3 = nextGreatestLetter(letters3, target3);
        System.out.println(result3);

    }
    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        int mid;

        if (target >= letters[end]){
            return letters[0];
        }

        while (start <= end){
            mid = start + (end - start)/2;
            if (letters[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start];
    }

}
