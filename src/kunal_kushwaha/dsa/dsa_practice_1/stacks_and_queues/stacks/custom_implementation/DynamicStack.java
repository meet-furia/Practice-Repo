package kunal_kushwaha.dsa.dsa_practice_1.stacks_and_queues.stacks.custom_implementation;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.stacks.implementation.StackException;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public void push(int item) throws StackException {
        if (isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        super.push(item);
    }

}
