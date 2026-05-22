package com.ndarla;

import java.util.*;

class MaxStack {
    private TreeMap<Integer, List<Node>> map;
    private DLL list;

    public MaxStack() {
        map = new TreeMap<>();
        list = new DLL();
    }

    public void push(int x) {
        Node node = list.add(x);
        map.computeIfAbsent(x, k -> new ArrayList<>()).add(node);
    }

    public int pop() {
        Node node = list.pop();
        List<Node> nodes = map.get(node.val);
        nodes.remove(nodes.size() - 1);
        if (nodes.isEmpty()) map.remove(node.val);
        return node.val;
    }

    public int top() {
        return list.peek();
    }

    public int peekMax() {
        return map.lastKey();
    }

    public int popMax() {
        int maxVal = peekMax();
        List<Node> nodes = map.get(maxVal);
        Node node = nodes.remove(nodes.size() - 1);
        if (nodes.isEmpty()) map.remove(maxVal);
        list.remove(node);
        return maxVal;
    }

    public static void main(String[] args) {
        MaxStack stack = new MaxStack();
        stack.push(5);
        stack.push(1);
        stack.push(5);
        System.out.print(stack.top() + "  ");
        System.out.print(stack.popMax() + "  ");
        System.out.print(stack.top() + "  ");
        System.out.print(stack.peekMax() + "  ");
        System.out.print(stack.pop() + "  ");
        System.out.print(stack.top() + "  ");

    }
}

// Helper Doubly Linked List Node
class Node {
    int val;
    Node prev, next;
    Node(int v) { val = v; }
}

// Helper Doubly Linked List to manage stack order
class DLL {
    Node head, tail;

    DLL() {
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    Node add(int val) {
        Node node = new Node(val);
        node.next = tail;
        node.prev = tail.prev;
        tail.prev.next = node;
        tail.prev = node;
        return node;
    }

    Node pop() {
        return remove(tail.prev);
    }

    int peek() {
        return tail.prev.val;
    }

    Node remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        return node;
    }
}
