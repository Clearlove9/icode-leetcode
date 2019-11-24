package com.fs.leetcode.stack;


import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 左括号入栈，右括号出栈
 * Given a string containing just the characters '(', ')', '{',
 * '}', '[' and ']', determine if the input string is valid.
 * https://leetcode-cn.com/problems/valid-parentheses/
 */
public class _20_Valid_Parentheses {
    private static Map<Character, Character> map;

    static {
        map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
    }

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }

        if (s.isEmpty()) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (map.containsKey(c)) {
                stack.push(c);
            } else {
                //右括号
                if (stack.empty()) {
                    return false;
                }

                if (map.get(stack.pop()) != c) {
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
