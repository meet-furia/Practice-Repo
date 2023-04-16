package kunal_kushwaha.dsa.dsa_practice_1.stacks_and_queues.stacks.custom_implementation;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.stacks.implementation.StackException;

public class CustomStack {
    private int ptr = 0;
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public void push(int item) throws StackException {
        if (isFull()) {
            throw new StackException("Stack is full");
        }
        data[ptr++] = item;
    }

    protected boolean isFull() {
        if (ptr == data.length) {
            return true;
        }
        return false;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Stack is empty");
        }
        return data[--ptr];
    }

    private boolean isEmpty() {
        if (ptr == 0) {
            return true;
        }
        return false;
    }

    public void display() {
        for (int i = 0; i < ptr; i++) {
            System.out.println(data[i]);
        }
    }
}
