package kunal_kushwaha.rest.control_statements_programs;

import java.util.Scanner;

public class ReverseNumber {
    int i;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you wish to reverse : ");
        int number = scanner.nextInt();
        reverseTheNumber(number);
    }

    void printI(){
        System.out.println(i);
    }
    static void reverseTheNumber(int number){
        int temp = number;
        int reversedNumber = 0;
        while (temp != 0){
            int i = temp % 10;
            reversedNumber = (reversedNumber * 10) + i;
            temp = temp/10;
        }
        System.out.println("The reversed number is : " + reversedNumber);
    }
}
