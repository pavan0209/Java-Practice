import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 10, 3, 4, 5, 6, 9, 8, 7);

        int sum1 = list.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum using reduce: " + sum1);

        int sum2 = list.stream().collect(Collectors.summingInt(n -> n));

        System.out.println("Sum using collectors: " + sum2);
    }
}