import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static int sumOfDivisors(int start, int end, int a, int b) {
        return IntStream.rangeClosed(start, end)
                .filter(number -> (number % a == 0) || (number % b == 0))
                .sum();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a start index: ");
        int start = scanner.nextInt();
        System.out.print("Please enter a end index: ");
        int end = scanner.nextInt();
        System.out.print("Please enter a divisor: ");
        int a = scanner.nextInt();
        System.out.print("Please enter a divisor: ");
        int b = scanner.nextInt();

        // sumOfDivisors(5, 15, 3, 5) -> 57
        // sumOfDivisors(2, 8, 2, 3) -> 23
        // System.out.println(sumOfDivisors(5, 15, 3, 5));
        // System.out.println(sumOfDivisors(2, 8, 2, 3));

        System.out.println("The sum of all divisors: " + sumOfDivisors(start, end, a, b));

        scanner.close();
    }
}