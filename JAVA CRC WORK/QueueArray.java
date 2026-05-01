public class QueueArray {
    int[] queue = new int[5];
    int front = 0, rear = -1, size = 0;

    void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue Full");
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = data;
        size++;
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Dequeued: " + queue[front]);
        front = (front + 1) % queue.length;
        size--;
    }

    void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.enqueue(10);
        q.enqueue(20);
        q.display();
        q.dequeue();
        q.display();
    }
}
