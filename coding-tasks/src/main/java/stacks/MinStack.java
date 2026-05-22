package stacks;

import java.util.Stack;

class MinStack {
    private Stack<Integer> mainStack = null;
    private Stack<Integer> minStack = null;

    public MinStack() {
        mainStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (mainStack.isEmpty()) {
            minStack.push(val);
            System.out.println("push main = " + val);
        } else if (!minStack.isEmpty() && minStack.peek() > val) {
            System.out.println("push min = " + val);
            minStack.push(val);
        }
    }

    public void pop() {
        int top = mainStack.pop();
        if (!minStack.isEmpty() && top == minStack.peek()) {
            minStack.pop();
        }
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.isEmpty() ? -1 : minStack.peek();
    }

    public static void main(String[] args) {
        MinStack stack = new MinStack();
        stack.push(-2);
        stack.push(0);
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        //top
        System.out.println(stack.top());
        //getMin
        System.out.println(stack.getMin());
        int param_3 = stack.top();
        int param_4 = stack.getMin();
    }
}

