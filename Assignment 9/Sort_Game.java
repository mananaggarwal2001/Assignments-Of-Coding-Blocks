import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Sort_Game {
    static class InputClass {
        String name;
        int salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int marks = sc.nextInt();
        int size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        InputClass[] arr = new InputClass[size];
        for (int i = 0; i < arr.length; i++) {
            String inputString = sc.nextLine();
            String[] parts = inputString.split(" ");
            arr[i] = new InputClass(); // Initialize the object
            arr[i].name = parts[0];
            arr[i].salary = Integer.parseInt(parts[1]);
        }
        printHighestSalaryInputClass(arr, marks);
    }

    private static void printHighestSalaryInputClass(InputClass[] arr, int marks) {
        PriorityQueue<InputClass> pq = new PriorityQueue<>((a, b) -> {
            if (b.salary - a.salary != 0) {
                return b.salary - a.salary;
            }
            return b.name.compareTo(a.name);
        });
        for (InputClass in : arr) {
            pq.add(in);
        }
        for (InputClass in : pq) {
            if (marks < in.salary) {
                System.out.print(in.name + " " + in.salary);
                System.out.println();
            }
        }
    }
}
