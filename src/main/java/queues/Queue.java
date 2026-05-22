package queues;

public class Queue {
    private Node front;
    private Node rear;
    private int size;

    private int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    private void enqueue(int value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    private int dequeue() {
        if (isEmpty()) {
            return -1;
        } else {
            if (front == rear) {
                rear = null;
            }
            Node frontNode = front;
            front = front.next;
            frontNode.next = null;
            size--;
            return frontNode.data;
        }
    }

    private boolean isEmpty() {
        return size == 0;
    }

    private int size() {
         return size;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Queue size is: " + queue.size());
        System.out.println("Dequeued element is: " + queue.dequeue());
        System.out.println("Queue size after dequeue is: " + queue.size());
    }
}
