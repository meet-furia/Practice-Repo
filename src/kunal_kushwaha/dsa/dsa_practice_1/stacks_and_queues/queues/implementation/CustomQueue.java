package kunal_kushwaha.dsa.dsa_practice_1.stacks_and_queues.queues.implementation;

public class CustomQueue {
    private int end = 0;
    int[] data;
    private static final int DEFAULT_SIZE = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        data = new int[size];
    }


}
