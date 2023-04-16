package kunal_kushwaha.dsa.dsa.number_problems_leetcode;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));

        System.out.println(isPalindrome(-121));

        System.out.println(isPalindrome(1));

        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(2147483647));

    }

    static public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }

        if (x == 0){
            return true;
        }

        int temp = x;
        long palindrome = 0;
        while (temp != 0){
            palindrome = palindrome * 10 + (temp % 10);
            temp = temp/10;
        }
        System.out.println(palindrome);
        if (palindrome == x){
            return true;
        }
        return false;
    }

    static public boolean isPalindromeOrNot(int x) {
        if (x < 0){
            return false;
        }

        if (x == 0){
            return true;
        }

        int temp = x;
        int palindrome = 0;
        while (temp != 0){
            palindrome = palindrome * 10 + (temp % 10);
            temp = temp/10;
        }
        if (palindrome == x){
            return true;
        }
        return false;
    }


}
