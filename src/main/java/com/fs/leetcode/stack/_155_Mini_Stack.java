package com.fs.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/min-stack/
 */
public class _155_Mini_Stack {
    private Stack<Integer> min;
    private Stack<Integer> stack;

    /**
     * initialize your data structure here.
     */
    public _155_Mini_Stack() {
        min = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);

        if (min.isEmpty()) {
            min.push(x);
        } else {
            if (x > min.peek()) {
                return;
            }

            min.push(x);
        }
    }

    public void pop() {
        int pop = stack.pop();

        if (pop == min.peek()) {
            min.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min.peek();
    }
}
