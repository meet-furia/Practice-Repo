package kunal_kushwaha.dsa.dsa.maths_for_dsa.practice1.bitwise_operators;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(nthMagicNumber(6));
    }
    static int nthMagicNumber(int number){
        int ans = 0;
        int base = 5;
        while (number > 0){
            int last = number & 1;
            number = number >> 1;
            ans += last * base;
            base = base * 5;
        }
        return ans;
    }
}
