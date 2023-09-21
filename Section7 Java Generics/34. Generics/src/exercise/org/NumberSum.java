package exercise.org;

import java.util.List;

public class NumberSum {
    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int sumEven = sumNumbers(numbers, true);
        int sumOdd = sumNumbers(numbers, false);
        
        System.out.println("Sum of even numbers: " + sumEven);
        System.out.println("Sum of odd numbers: " + sumOdd);
    }

    public static <T extends Number> int sumNumbers(List<T> numbers, boolean even) {
        int sum = 0;

        for (T number : numbers) {
            int value = number.intValue();
            if (even && value % 2 == 0) {
                sum += value;
            } else if (!even && value % 2 != 0) {
                sum += value;
            }
        }

        return sum;
    }
}
