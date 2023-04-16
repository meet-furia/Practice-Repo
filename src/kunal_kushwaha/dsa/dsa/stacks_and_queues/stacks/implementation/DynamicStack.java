package kunal_kushwaha.dsa.dsa.stacks_and_queues.stacks.implementation;

public class DynamicStack extends CustomStack {
    public DynamicStack() {
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) throws StackException {
        if (isFull()) {
            int[] temp = new int[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
