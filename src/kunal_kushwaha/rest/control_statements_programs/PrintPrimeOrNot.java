package kunal_kushwaha.rest.control_statements_programs;

import java.util.Scanner;

public class PrintPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter number to see if it is prime : ");
        int number = scanner.nextInt();
        printPrimeOrNot(number);

        System.out.println("Enter number till which you need prime numbers to be printed : ");
        int numbersToPrint = scanner.nextInt();
        printPrimeNumbers(numbersToPrint);

    }
    static void printPrimeOrNot(int number){
        boolean flag = false;
        if (number == 0 || number == 1){
            System.out.println(number + " is not a prime number");
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if (number % i == 0){
                    System.out.println(number + " is not a prime number");
                    flag = true;
                    break;
                }
            }
            if (flag == false){
                System.out.println(number + " is not a prime number");
            }
        }
    }

    static void printPrimeNumbers(int number){
        for (int i = 2; i <= number; i++){
            boolean flag = true;
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true){
                System.out.print(i + " ");
            }
        }
    }
    static int isPrime(int N){
        // code here
        boolean flag = false;
        int k = 0;
        if (N == 0 || N == 1){
            k = 0;
        }

        else {
            for (int i = 2; i <= Math.sqrt(N); i++){
                if (N % i == 0){
                    flag = true;
                    k = 0;
                    break;
                }
            }
            if (flag == false){
                k = 1;
            }
        }
        return k;
    }

}
