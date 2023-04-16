package kunal_kushwaha.dsa.dsa.stacks_and_queues.stacks.implementation;

public class CustomStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
