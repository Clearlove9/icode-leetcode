package com.fs.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/implement-queue-using-stacks/
 */
public class _232_Implement_Queue_using_Stacks {
    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public _232_Implement_Queue_using_Stacks() {
        outStack = new Stack<>();
        inStack = new Stack<>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        inStack.push(x);
    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        if (!outStack.isEmpty()) {
            return outStack.pop();
        }

        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }

        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        if (!outStack.isEmpty()) {
            return outStack.peek();
        }

        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }

        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return inStack.empty() && outStack.isEmpty();
    }

    public static void main(String[] args) {
        _232_Implement_Queue_using_Stacks myqueue = new _232_Implement_Queue_using_Stacks();
        myqueue.push(1);
        myqueue.push(2);
        System.out.println(myqueue.peek());
        System.out.println(myqueue.pop());
        myqueue.push(3);
        myqueue.push(4);
        System.out.println(myqueue.pop());
        System.out.println(myqueue.pop());
        System.out.println(myqueue.pop());
    }
}
