package kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.custom_queue;

public class CustomQueueMain {
    public static void main(String[] args) throws QueueException {
        CustomQueue customQueue = new CustomQueue(5);
        customQueue.insert(5);
        customQueue.insert(10);
        customQueue.insert(15);
        customQueue.insert(20);
        customQueue.insert(25);

        System.out.println(customQueue.end);
        System.out.println();

        customQueue.remove();
        System.out.println(customQueue.end);
        System.out.println(customQueue.remove());
        System.out.println(customQueue.end);

        System.out.println();
        customQueue.display();
        customQueue.display();
    }
}
