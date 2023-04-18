package takeuforward.sde_sheet.sde_sheet.arrays.gfg;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr1 = {12, 35, 1, 10, 34, 1};
        int secondLargest1 = print2largest(arr1, arr1.length);
        System.out.println(secondLargest1);

        int[] arr2 = {10, 5, 10};
        int secondLargest2 = print2largest(arr2, arr2.length);
        System.out.println(secondLargest2);
    }

    static int print2largest(int arr[], int n) {
        // code here
        int firstLargest = largest(arr, n);
        int secondLargest = -1;
        for(int i = 0; i < n; i++) {
            if(arr[i] != firstLargest) {
                if(arr[i] > secondLargest) {
                    secondLargest = arr[i];
                }
            }
        }
        return secondLargest;
    }

    static public int largest(int arr[], int n) {
        int largest = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

}
