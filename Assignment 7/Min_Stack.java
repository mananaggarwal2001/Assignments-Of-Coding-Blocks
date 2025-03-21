import java.util.Scanner;

public class Min_Stack {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String args[]) throws Exception {
        int number = sc.nextInt();
        String[] numberString = new String[number];
        for (int i = 0; i < numberString.length; i++) {
            numberString[i] = sc.next();
        }
        operations(numberString);

    }

    public static void operations(String[] numberString) throws Exception {
        Stack_Manual st = new Stack_Manual();
        for (String value : numberString) {
            if (value.equals("push")) {
                int item = sc.nextInt();
                st.push(item);
            } else if (value.equals("pop")) {
                st.pop();
            } else if (value.equals("top")) {
                int result = st.top();
                System.out.print(result + " ");
            } else if (value.equals("getMin")) {
                int result = st.getMin();
                System.out.print(result + " ");
            }
        }
    }

    static class Stack_Manual {
        private int index = -1;
        private int size = 0;
        private int[] numberArray;

        public Stack_Manual() {
            numberArray = new int[5];
        }

        public Stack_Manual(int quantity) {
            numberArray = new int[quantity];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == numberArray.length;
        }

        public int top() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is Empty");
            }
            int data = numberArray[index];
            return data;
        }

        public void push(int item) throws Exception {
            if (isFull()) {
                int[] newStack = new int[numberArray.length * 2];
                for (int i = 0; i < numberArray.length; i++) {
                    newStack[i] = numberArray[i];
                }
                numberArray = newStack;
            }
            size++;
            index++;
            numberArray[index] = item;
        }

        public int pop() throws Exception {
            if (isEmpty()) {
                throw new Exception("Stack is empty");
            }
            int rv = numberArray[index];
            index--;
            size--;
            return rv;
        }

        public int getMin() {
            int number = Integer.MAX_VALUE;
            for (int i = 0; i <= index; i++) {
                number = Math.min(number, numberArray[i]);
            }
            return number;
        }
    }
}
