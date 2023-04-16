package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List list1 = fizzBuzz(15);
        System.out.println(list1);
        // Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    }
    static public List<String> fizzBuzz(int n) {
        List list = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                list.add("Fizz");
            }
            else if (i % 5 == 0) {
                list.add("Buzz");
            }
            else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }

}
