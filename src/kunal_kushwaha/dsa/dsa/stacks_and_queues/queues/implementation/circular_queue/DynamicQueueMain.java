package kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.circular_queue;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.custom_queue.QueueException;

public class DynamicQueueMain {
    public static void main(String[] args) throws QueueException {
        DynamicQueue dynamicQueue = new DynamicQueue(5);
        dynamicQueue.insert(5);
        dynamicQueue.insert(10);
        dynamicQueue.insert(15);
        dynamicQueue.insert(20);
        dynamicQueue.insert(25);

        dynamicQueue.display();

        dynamicQueue.remove();
        dynamicQueue.insert(30);
        dynamicQueue.insert(35);

        dynamicQueue.display();


    }
}
