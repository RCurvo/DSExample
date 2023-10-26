public class QueueExample {
    private Integer[] numArray;
    private int size;
    private int front;
    private int rear;

    private final int MAX_ELEMENTS = 20;

    QueueExample(){
        size = 0;
        numArray = new Integer[MAX_ELEMENTS];
        front = 0;
        rear = -1;
    }

    public void enqueue(Integer num){
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear+1) % MAX_ELEMENTS;
        numArray[rear] = num;
        size++;
    }

    public Integer dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
        }
        int resultNumber = numArray[front];
        front = (front +1) % MAX_ELEMENTS;
        size--;
        return resultNumber;
    }

    public boolean isFull() {
        return size == MAX_ELEMENTS;
    }

    public Integer size(){
        return size;
    }

    public Integer front(){
        if (isEmpty()){
            return null;
        }
        return numArray[front];
    }

    public Integer rear(){
        if (isEmpty()){
            return null;
        }
        return numArray[rear];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public static void main(String[] args){
        QueueExample queue = new QueueExample();
        queue.enqueue(7);
        queue.enqueue(5);
        queue.enqueue(9);

        System.out.println("SIZE: " + queue.size());
        System.out.println("FRONT: " + queue.front());
        System.out.println("REAR: " + queue.rear());

        while (queue.size() > 0) {
            System.out.println("DEQUEUEING NUMBER: " + queue.dequeue());
            System.out.println("SIZE: " + queue.size());
            System.out.println("FRONT: " + queue.front());
            System.out.println("REAR: " + queue.rear());
        }

    }
}
