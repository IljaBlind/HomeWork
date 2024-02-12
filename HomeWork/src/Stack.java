public class Stack {
    public static void main(String[] args) {

    }

    public class ArrayQueue {
        private int[] array;
        private int front;
        private int rear;
        private int capacity;

        public ArrayQueue(int capacity) {
            this.array = new int[capacity];
            this.front = 0;
            this.rear = 0;
            this.capacity = capacity;
        }

        public boolean isEmpty() {
            return front == rear;
        }

        public boolean isFull() {
            return (rear + 1) % capacity == front;
        }

        public void enqueue(int value) {
            if (isFull()) {
                throw new IllegalStateException("Queue is full");
            }
            rear = (rear + 1) % capacity;
            array[rear] = value;
        }

        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            front = (front + 1) % capacity;
            return array[front];
        }

        public int getFront() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return array[front];
        }
    }
}
