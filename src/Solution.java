class Solution
{
    public static void main(String[] args) {
        System.out.println(is_palindrome(555));
    }
    static public String is_palindrome(int n)
    {
        // Code here
        int temp = n;
        int reversedN = 0;
        
        while(temp > 0){
            int rem = temp % 10;
            reversedN = reversedN * 10 + rem;
            temp = temp/10;
        }
        
        if(reversedN == n){
            return "Yes";
        }
        
        return "No";
        
    }
}