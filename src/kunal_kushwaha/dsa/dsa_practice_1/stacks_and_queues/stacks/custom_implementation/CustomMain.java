package kunal_kushwaha.dsa.dsa_practice_1.stacks_and_queues.stacks.custom_implementation;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.stacks.implementation.StackException;

public class CustomMain {
    public static void main(String[] args) throws StackException {
        DynamicStack customStack = new DynamicStack(5);
        customStack.push(5);
        customStack.push(10);
        customStack.push(15);
        customStack.push(20);
        customStack.push(25);

        customStack.display();

        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();
        customStack.pop();

        customStack.display();
    }
}
