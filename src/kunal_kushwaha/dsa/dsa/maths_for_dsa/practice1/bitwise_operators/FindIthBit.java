package kunal_kushwaha.dsa.dsa.maths_for_dsa.practice1.bitwise_operators;

public class FindIthBit {
    public static void main(String[] args) {
        int a = 50;
        int seventhBit = a & (1 << 5);
        System.out.println(seventhBit);
    }
}
