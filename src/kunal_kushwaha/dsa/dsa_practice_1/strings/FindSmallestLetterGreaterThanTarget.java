package kunal_kushwaha.dsa.dsa_practice_1.strings;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters1 = {'c','f','j'};
        char next1 = nextGreatestLetter(letters1, 'a');
        System.out.println(next1);

        char[] letters2 = {'x','x','y','y'};
        char next2 = nextGreatestLetter(letters2, 'z');
        System.out.println(next2);

    }
    static public char nextGreatestLetterUsingLinearSearch(char[] letters, char target) {
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] > target) {
                return letters[i];
            }
        }
        return letters[0];
    }

    static public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;

        if (target >= letters[end]){
            return letters[0];
        }
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (letters[mid] <= target) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
            if (start == end) {
                    return letters[start];
            }
        }
        return letters[0];
    }
}
