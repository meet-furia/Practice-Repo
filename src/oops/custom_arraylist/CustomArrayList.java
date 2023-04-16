package oops.custom_arraylist;

public class CustomArrayList {
    int[] data;
    int size = 0;
    private static int DEFAULT_SIZE = 10;

    public CustomArrayList() {
        data = new int[10];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }



}
