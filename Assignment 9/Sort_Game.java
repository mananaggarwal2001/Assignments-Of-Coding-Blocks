import java.util.*;

public class Sort_Game {
    static class Employee {
        String name;
        int salary;

        Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt(); // Minimum salary threshold
        int n = sc.nextInt(); // Number of employees
        sc.nextLine(); // Consume leftover newline

        List<Employee> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            String name = parts[0];
            int salary = Integer.parseInt(parts[1]);

            if (salary >= x) {
                list.add(new Employee(name, salary));
            }
        }

        // Sort by salary descending, then by name lexicographically
        Collections.sort(list, (a, b) -> {
            if (b.salary != a.salary) {
                return b.salary - a.salary;
            } else {
                return a.name.compareTo(b.name);
            }
        });

        // Print the names
        for (Employee e : list) {
            System.out.println(e.name + " " + e.salary);
        }

        sc.close();
    }
}
