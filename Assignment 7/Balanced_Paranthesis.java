import com.sun.tools.javac.Main;

import java.util.*;

public class Balanced_Paranthesis {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        s.close();

        Balanced_Paranthesis mainObj = new Balanced_Paranthesis();
        StacksUsingArrays stack = mainObj.new StacksUsingArrays(10000);

        if (isBalanced(str, stack)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isBalanced(String str, StacksUsingArrays stack) throws Exception {
        if (str.length() == 0) {
            return true; // An empty string is considered balanced
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false; // Closing bracket without an opening bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{')) {
                    return false; // Mismatched brackets
                }
            }
        }
        return stack.isEmpty(); // Stack should be empty if balanced
    }

    private class StacksUsingArrays {
        private char[] data;
        private int tos;

        public static final int DEFAULT_CAPACITY = 10;

        public StacksUsingArrays() throws Exception {
            this(DEFAULT_CAPACITY);
        }

        public StacksUsingArrays(int capacity) throws Exception {
            if (capacity <= 0) {
                throw new Exception("Invalid Capacity");
            }
            this.data = new char[capacity];
            this.tos = -1;
        }

        public int size() {
            return this.tos + 1;
        }

        public boolean isEmpty() {
            return this.tos == -1;
        }

        public void push(char item) throws Exception {
            if (this.size() == this.data.length) {
                throw new Exception("Stack is Full");
            }
            this.data[++this.tos] = item;
        }

        public char pop() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            return this.data[this.tos--];
        }

        public char top() throws Exception {
            if (this.isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            return this.data[this.tos];
        }
    }
}
