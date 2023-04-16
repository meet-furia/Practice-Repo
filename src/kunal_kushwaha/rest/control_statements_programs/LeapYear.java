package kunal_kushwaha.rest.control_statements_programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continueProgram;
        do {
            System.out.println("Enter year : ");
            int year = scanner.nextInt();
            leapYearOrNot(year);
            System.out.println("Press y to continue and n to exit : ");
            continueProgram = scanner.next();
        }
        while (continueProgram.equals("y"));
    }
    static void leapYearOrNot(int year){
        boolean leapYear = false;
        if (year % 4 == 0){
            leapYear = true;
            if (year % 100 == 0){
                if (year % 400 == 0){
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
        }
        if (leapYear){
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }

    static int isLeap(int N){
        //code here
        int i;
        boolean leapYear = false;
        if (N % 4 == 0){
            leapYear = true;
            if (N % 100 == 0){
                if (N % 400 == 0){
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
        }
        if (leapYear){
            i = 1;
        }
        else {
            i = 0;
        }
        return i;
    }

}
