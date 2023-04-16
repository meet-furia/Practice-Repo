package kunal_kushwaha.rest.control_statements_programs;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number till which you need to print fibonacci number : ");
//        int number = scanner.nextInt();
        printTillFibonacciNumbers(100);
        System.out.println();

        printNFibonacciNumbers(100);
        System.out.println();

        printParticularFibonacciNumber(7);

        int n = 3;
        long[] fibonacciNumbers = printFibb(n);

        for (int i = 0; i < n; i++){
            System.out.print(fibonacciNumbers[i] + " ");
        }
   }


    static void printTillFibonacciNumbers(int number){

        int firstNum = 0;
        int secondNum = 1;
        int thirdNum = 3;

        if (number < 0){
            System.out.print("Enter positive number");
        }
        if (number == 1){
            System.out.print(firstNum);
        }
        if (number == 2){
            System.out.print(firstNum + " ");
            System.out.print(secondNum);
        }
        else if (number > 2){
            System.out.print(firstNum + " ");
            System.out.print(secondNum + " ");
            while (thirdNum <= number){
                thirdNum = firstNum + secondNum;
                if (thirdNum <= number){
                    System.out.print(thirdNum + " ");
                    firstNum = secondNum;
                    secondNum = thirdNum;
                }
            }
        }
    }
    static void printNFibonacciNumbers(int number){
        int firstNum = 0;
        int secondNum = 1;
        int thirdNum;
        if (number < 0){
            System.out.print("Enter positive number");
        }
        if (number == 1){
            System.out.print(firstNum);
        }
        if (number == 2){
            System.out.print(firstNum + " ");
            System.out.print(secondNum);
        }
        else if (number > 2){
            System.out.print(firstNum + " ");
            System.out.print(secondNum + " ");
            for (int i = 3; i <= number; i++){
                thirdNum = firstNum + secondNum;
                System.out.print(thirdNum + " ");
                firstNum = secondNum;
                secondNum = thirdNum;
            }
        }
    }
    static void printParticularFibonacciNumber(int number){
        int firstNum = 0;
        int secondNum = 1;
        int finalNum = 1;
        int count = 2;

        if (number < 0){
            System.out.print("Enter positive number");
        }
        if (number == 1){
            System.out.println("Fibonacci Number at " + number + " place is : " + firstNum);
        }
        if (number == 2){
            System.out.println("Fibonacci Number at " + number + " place is : " + secondNum);
        }
        else if (number > 2){
            while (count <= number){
                finalNum = firstNum + secondNum;
                firstNum = secondNum;
                secondNum = finalNum;
                count++;
            }
            System.out.println("Fibonacci Number at " + number + " place is : " + finalNum);
        }
    }

    public static long[] printFibb(int n){
        long firstNum = 1;
        long secondNum = 1;
        long thirdNum = 2;
        int count = 3;
        long[] fibonacciNumbers = new long[n];

        if (n == 1){
                fibonacciNumbers[0] = firstNum;
        }

        if (n == 2){
                fibonacciNumbers[0] = firstNum;
                fibonacciNumbers[1] = secondNum;
        }
        if (n >= 3){
            fibonacciNumbers[0] = firstNum;
            fibonacciNumbers[1] = secondNum;
            for (int i = 2; i < n; i++){
                thirdNum = firstNum + secondNum;
                fibonacciNumbers[i] = thirdNum;
                firstNum = secondNum;
                secondNum = thirdNum;
            }
        }
        return fibonacciNumbers;


    }

//    public int[] findFibSubset(int arr[], int n) {
//        int[] fibNumbers = new int[n];
//        int firstNum = 0;
//        int secondNum = 1;
//        int thirdNum;
//
//        for (int i = 0; i < n; i++){
//
//        }
//    }

}
