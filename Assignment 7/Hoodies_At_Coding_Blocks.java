import com.sun.tools.javac.Main;

import java.util.*;

public class Hoodies_At_Coding_Blocks {
    protected int size;
    protected int front;
    protected int[] data;

    public Hoodies_At_Coding_Blocks() {
        this.size = 0;
        this.front = 0;
        this.data = new int[5];
    }

    public Hoodies_At_Coding_Blocks(int cap) {
        this.size = 0;
        this.front = 0;
        this.data = new int[cap];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public void enqueue(int item) {
        if (this.size == this.data.length) {
            int[] oa = this.data;
            int[] na = new int[oa.length * 2];
            for (int i = 0; i < this.size; i++) {
                int idx = (i + front) % oa.length;
                na[i] = oa[idx];
            }
            this.data = na;
            this.front = 0;
        }
        this.data[(front + size) % this.data.length] = item;
        size++;
    }

    public int dequeue() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");
        }
        int rv = this.data[front];
        front = (front + 1) % this.data.length;
        size--;
        return rv;
    }

    public int getFront() throws Exception {
        if (this.size == 0) {
            throw new Exception("queue is empty");
        }
        return this.data[front];
    }

    public void display() {
        System.out.println();
        for (int i = 0; i < size; i++) {
            int idx = (i + front) % this.data.length;
            System.out.print(this.data[idx] + " ");
        }
        System.out.println("END");
    }

    public static void hoodies(int q, Scanner scn) {
        Map<Integer, Queue<Integer>> integerMap = new LinkedHashMap<>(); // Preserve insertion order
        while (q-- > 0) {
            char operation = scn.next().charAt(0);
            if (operation == 'E') {
                int course = scn.nextInt();
                int rollNumber = scn.nextInt();
                integerMap.putIfAbsent(course, new LinkedList<>());
                integerMap.get(course).add(rollNumber);
            } else if (operation == 'D') {
                if (!integerMap.isEmpty()) {
                    int course = integerMap.keySet().iterator().next(); // Get first key (FIFO)
                    int rollNumber = integerMap.get(course).poll();
                    if (integerMap.get(course).isEmpty()) {
                        integerMap.remove(course);
                    }
                    System.out.println(course + " " + rollNumber);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        hoodies(n, scn);
        scn.close();
    }
}
