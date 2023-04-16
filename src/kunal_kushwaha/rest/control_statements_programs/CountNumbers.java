package kunal_kushwaha.rest.control_statements_programs;

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesOrNo;
        do {
            System.out.println("Enter number : ");
            int number = scanner.nextInt();
            countNumbers(number);
            System.out.println("Do you wish to continue : ");
            yesOrNo = scanner.next();
        }
        while (yesOrNo.equals("y"));
    }
    static void countNumbers(int number){
        int numbers = 0;
        int temp = number;
        while (temp != 0){
            temp = temp/10;
            numbers++;
        }
        System.out.println("Total numbers are : " + numbers);
    }
}
