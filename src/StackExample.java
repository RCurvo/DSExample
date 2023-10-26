public class StackExample {
    private Integer[] numArray;
    private int size;
    private int top;

    public StackExample(int max) {
        numArray = new Integer[max];
        size = 0;
        top = -1;
    }

    public void push(Integer num) {
        if (size == numArray.length) {
            System.out.println("Stack is full.");
        } else {
            numArray[++top] = num;
            size++;
        }
    }

    public Integer pop(){
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        size--;
        return numArray[top--];
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public Integer peek(){
        if(isEmpty()){
            System.out.println("Stack is empty.");
            return null;
        }
        return numArray[top];
    }

    public static void main(String[] args){
        StackExample stack = new StackExample(5);

        stack.push(5);
        stack.push(50);
        stack.push(12);

        System.out.println("Size: " + stack.size()); // Output: 3
        System.out.println("Top element: " + stack.peek()); // Output: 3

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}