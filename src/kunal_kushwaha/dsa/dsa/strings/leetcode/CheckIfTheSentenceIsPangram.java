package kunal_kushwaha.dsa.dsa.strings.leetcode;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence1 = "anmt";
        boolean checkIfPangram1 = checkIfPangram(sentence1);
        System.out.println(checkIfPangram1);
    }
    static public boolean checkIfPangram(String sentence) {
        int[] arr = new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            int index = sentence.charAt(i) % 97;
            arr[index]++;
        }
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                return false;
            }
        }
        for (int i : arr) {
            if (i == 0){
                return false;
            }
        }
        return true;
    }

}
