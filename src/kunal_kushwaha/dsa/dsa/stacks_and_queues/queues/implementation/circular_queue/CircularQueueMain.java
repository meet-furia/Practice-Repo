package kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.circular_queue;

import kunal_kushwaha.dsa.dsa.stacks_and_queues.queues.implementation.custom_queue.QueueException;

public class CircularQueueMain {
    public static void main(String[] args) throws QueueException {
        CircularQueue circularQueue = new CircularQueue(5);
        circularQueue.insert(5);
        circularQueue.insert(10);
        circularQueue.insert(15);
        circularQueue.insert(20);
        circularQueue.insert(25);

        circularQueue.remove();
        circularQueue.remove();
        circularQueue.remove();

        circularQueue.remove();
        circularQueue.remove();

        circularQueue.display();

        circularQueue.remove();
        circularQueue.insert(30);

        circularQueue.display();
    }
}
