package kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.circular_queue;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.custom_queue.QueueException;

public class CircularQueue {
    private static int DEFAULT_SIZE = 10;
    protected int[] data;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);

    }

    public CircularQueue(int size) {
        data = new int[size];
    }

    protected boolean isFull() {
        return size == data.length;
    }

    private boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) throws QueueException {
        if (isFull()) {
            throw new QueueException("Queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;

        return true;
    }

    public int remove() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;

        return removed;
    }
    public int front() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Queue is empty");
        }
        return data[0];
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i = i % data.length;
        }
        while (i != end);
        System.out.println("End");
    }

}
