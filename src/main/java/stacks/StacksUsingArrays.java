package stacks;

public class StacksUsingArrays {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StacksUsingArrays(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    private void push(int value) {
        if (top == maxSize -1) {
            System.out.println("Stack Overflow");
        } else {
            stackArray[++top] = value;
        }
    }

    private int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    private int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    private int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        StacksUsingArrays stack = new StacksUsingArrays(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        System.out.println("Stack size is: " + stack.size());
        System.out.println("Popped element is: " + stack.pop());
        System.out.println("Stack size after pop is: " + stack.size());
    }
}
