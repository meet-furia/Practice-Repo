package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.arrays_practice;

public class ArrayNumberSwapper {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        numberSwapperThreeElements(array);

        int[] array1 = {1, 2, 3, 4, 5};
        numberSwapperThreeElements(array1);
    }

    static void numberSwapperThreeElements(int[] array) {
        int temp;
        if (array.length >= 6){
            for (int i = 2; i < array.length; i += 6) {
                temp = array[i];
                array[i] = array[i + 3];
                array[i + 3] = temp;
            }
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
        else {
            System.out.println("Array should have at least three characters");
        }
    }

    static void numberSwapperPrimeNumbers(int[] array) {
        int tempPrimeNumber = 0;
        int firstPrimeNumber;
        int secondPrimeNumber;
        boolean flag = false;
        for (int i = 0; i < array.length; i++) {
            if (tempPrimeNumber != 0) {
                flag = true;
            }
            for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                if (array[i] % j == 0) {
                    if (flag == false){
                        tempPrimeNumber = array[i];
                }
                    else if (flag == true){
                        array[i] = tempPrimeNumber;

                    }
            }

        }
    }
}
}
