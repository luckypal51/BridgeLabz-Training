package Question.Traffic;

class VehicleQueue {
    private Vehicle[] queue;
    private int front = 0, rear = -1, size = 0;

    VehicleQueue(int capacity) {
        queue = new Vehicle[capacity];
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(Vehicle v) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot add " + v.vehicleNo);
            return;
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = v;
        size++;
    }

    public Vehicle dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting");
            return null;
        }
        Vehicle v = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return v;
    }
}
