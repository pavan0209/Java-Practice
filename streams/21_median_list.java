import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(5, 2, 1, 3, 4);
        int size = numbers.size();

        double median = numbers.stream()
                .sorted()
                .mapToInt(num -> num.intValue())
                .skip((size - 1) / 2)
                .limit(2 - size % 2)
                .average()
                .orElse(0.0);

        System.out.println("Median: " + median);
    }
}