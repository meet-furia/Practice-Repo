package kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.custom_queue;

public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    protected boolean isFull() {
        return end == data.length;
    }

    private boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full");
        }
        data[end++] = item;
        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--;
        return removed;
    }
    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.println(data[i] + " ");
        }
        System.out.println("End");
    }

}
