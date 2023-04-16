package kunal_kushwaha.dsa.dsa.arrays.arrays_and_arraylist.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList();
        int number = 10;
        int i = 1;
        while (i <= number){
            arrayList1.add(i);
            i++;
        }
        arrayList1.add(10, 13);

        int j = 0;
        while (j < arrayList1.size()){
            System.out.print(arrayList1.get(j) + " ");
            j++;
        }
        System.out.println();

        System.out.println(arrayList1);
        arrayList1.toString();
        System.out.println(arrayList1);
        arrayList1.toArray();
        System.out.println(arrayList1);


        System.out.println();
        System.out.println("Multi dimension arraylist starts");
        // Multi dimensional array

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrayList2 = new ArrayList();

        for (int k = 0; k < 3; k++){
            arrayList2.add(new ArrayList<>());
        }

        for (int k = 0; k < 3; k++){
            for (int l = 0; l < 3; l++){
                arrayList2.get(k).add(in.nextInt());
//                arrayList1.add(i, in.nextInt());
            }
        }
        System.out.println(arrayList2);
    }

}
