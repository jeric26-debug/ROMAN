import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

        Predicate<Integer> isPositive = n -> n > 0;
        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isGreaterThanOne = n -> n > 1;

        List<Integer> positiveNumbers = numbers.stream().filter(isPositive).collect(Collectors.toList());
        List<Integer> evenNumbers = numbers.stream().filter(isEven).collect(Collectors.toList());
        List<Integer> greaterThanOne = numbers.stream().filter(isGreaterThanOne).collect(Collectors.toList());

        System.out.println("Original List: " + numbers);
        System.out.println("Positive Numbers: " + positiveNumbers);
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Numbers Greater Than 1: " + greaterThanOne);
    }
}