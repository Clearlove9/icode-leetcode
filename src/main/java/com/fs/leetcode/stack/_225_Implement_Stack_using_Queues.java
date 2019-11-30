package com.fs.leetcode.stack;

import java.util.LinkedList;
import java.util.Queue;

public class _225_Implement_Stack_using_Queues {
    private Queue<Integer> inQueue;
    private Queue<Integer> tmpQueue;

    /**
     * Initialize your data structure here.
     */
    public _225_Implement_Stack_using_Queues() {
        inQueue = new LinkedList<>();
        tmpQueue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        inQueue.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        checkInQueue();
        return inQueue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        checkInQueue();
        return inQueue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return inQueue.isEmpty() && tmpQueue.isEmpty();
    }

    private void checkInQueue() {
        if (inQueue.isEmpty()) {
            while (!tmpQueue.isEmpty()) {
                inQueue.offer(tmpQueue.poll());
            }
        }

        while (inQueue.size() != 1) {
            tmpQueue.offer(inQueue.poll());
        }
    }

    public static void main(String[] args) {
        _225_Implement_Stack_using_Queues stack = new _225_Implement_Stack_using_Queues();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        stack.push(4);
        stack.push(5);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
