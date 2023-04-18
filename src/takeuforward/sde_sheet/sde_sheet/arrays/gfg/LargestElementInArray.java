package takeuforward.sde_sheet.sde_sheet.arrays.gfg;

public class LargestElementInArray {
    public int largest(int arr[], int n) {
        int largest = arr[0];
        for(int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

}
