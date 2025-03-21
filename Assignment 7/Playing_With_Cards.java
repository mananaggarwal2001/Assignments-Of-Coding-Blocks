import java.util.*;

public class Playing_With_Cards {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();
        Stack<Integer> A = new Stack<>();

        // Read cards and push them onto stack A
        for (int i = 0; i < N; i++) {
            A.push(sc.nextInt());
        }

        sc.close(); // Close scanner to prevent resource leak

        // Generate first Q prime numbers using the Sieve of Eratosthenes
        List<Integer> primes = generatePrimes(Q);

        List<Stack<Integer>> B = new ArrayList<>();
        for (int i = 0; i < Q; i++) {
            B.add(new Stack<>()); // Create Bi stacks
        }

        // Process stacks
        for (int i = 0; i < Q; i++) {
            Stack<Integer> nextA = new Stack<>();
            while (!A.isEmpty()) {
                int num = A.pop();
                if (num % primes.get(i) == 0) {
                    B.get(i).push(num); // Add to Bi stack
                } else {
                    nextA.push(num); // Add to new Ai stack
                }
            }
            A = nextA; // Update A stack for the next iteration
        }

        // Output Bi stacks in order
        for (Stack<Integer> stack : B) {
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }

        // Output final A stack (AQ)
        while (!A.isEmpty()) {
            System.out.println(A.pop());
        }
    }

    // Function to generate first 'count' prime numbers
    public static List<Integer> generatePrimes(int count) {
        int limit = 1000000; // Upper bound for sieve
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= limit && primes.size() < count; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }

        return primes;
    }
}
