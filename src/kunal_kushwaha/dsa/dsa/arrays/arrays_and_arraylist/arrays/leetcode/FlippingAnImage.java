package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arrays.leetcode;

public class FlippingAnImage {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        int[][] arr2 =  flipAndInvertImage(arr);
        for (int[] i : arr2){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }
//        int[][] arr3 = invertImage(arr);
//        for (int[] i : arr3){
//            for (int j : i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        int[][] arr3 = flipAndInvertImage1(arr);
        for (int[] i : arr3){
            for (int j : i){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static public int[][] flipAndInvertImage(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int k = image[i].length - 1;
            for(int j = 0; j < k; j++){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;
                k--;
            }
        }
        invertImage(image);
        return image;
    }
     static public int[][] invertImage(int[][] image){
        for (int i = 0; i < image.length; i++){
            for (int j = 0; j < image[i].length; j++){
                if (image[i][j] == 0){
                    image[i][j] = 1;
                }
                else {
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }


    static public int[][] flipAndInvertImage1(int[][] image) {
        for(int i = 0; i < image.length; i++){
            int k = image[i].length - 1;
            for(int j = 0; j <= k; j++){
                int temp = image[i][j];
                image[i][j] = image[i][k];
                image[i][k] = temp;

                if (image[i][j] == 1){
                    image[i][j] = 0;
                }
                else {
                    image[i][j] = 1;
                }

                if (image[i][k] == 1){
                    image[i][k] = 0;
                }
                else {
                    image[i][k] = 1;
                }
                k--;
            }
        }
        invertImage(image);
        return image;
    }

}
