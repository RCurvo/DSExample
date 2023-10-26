

public class LinkedListExample {
    class   Node {
        Integer data;
        Node next;

        public  Node(Integer data){
            this.data = data;
            this.next = null;
        }
    }
    private Node head;
    private int size;

    public LinkedListExample(){
        head = null;
        size = 0;
    }

    public void push(Integer num){
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public Integer pop(){
        if (isEmpty()) {
            System.out.println("List is empty.");
            return null;
        }
        Node node = head;
        head = head.next;
        size--;
        return node.data;
    }

    public void insert(int index, Integer num) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            push(num);
            return;
        }
        Node newNode = new Node(num);
        Node current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
            size++;
    }

    public Integer remove (int index){
        if (index < 0 || index > size) {
            System.out.println("Invalid index.");
            return null;
        }
        if (index == 0){
            return pop();
        }
        Node current = head;
        for (int i =1; i < index; i++){
            current = current.next;
        }
        Node deletedNode = current.next;
        current.next = current.next.next;
        size--;
        return deletedNode.data;
    }

    public Integer findElement(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index.");
            return null;
        }
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    public void printList(){
        Node current = head;
        while (current != null){
            System.out.print(current.data);
            if (current.next != null){
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedListExample list = new LinkedListExample();

        list.push(2);
        list.push(9);
        list.push(8);

        list.printList();


        list.insert(1, 7);
        list.printList();


        System.out.println("Remove item at index 2: " + list.remove(2));
        list.printList();

        System.out.println("Size: " + list.size());
        System.out.println("Element at index 1: " + list.findElement(1));

        list.pop();
        list.printList();
    }


}
