public class QueueUsingArray {
    private int MAX_SIZE;
    private int[] queue;
    private int front, rear;
    public QueueUsingArray(int size) {
        MAX_SIZE = size;
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = item;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = queue[front];
        front = (front + 1) % MAX_SIZE;
        return item;
    }
    public boolean isEmpty() {
        return (rear == -1);
    }
    public boolean isFull() {
        return ((rear + 1) % MAX_SIZE == front);
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No elements to peek.");
            return -1; 
        }
        return queue[front];
    }
    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element: " + queue.peek());
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println(queue.dequeue() + " dequeued from queue");
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Front element: " + queue.peek());
        while (!queue.isEmpty()) {
            System.out.println(queue.dequeue() + " dequeued from queue");
        }
    }
}