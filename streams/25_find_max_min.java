import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 10, 100, 3, 4, 5, 9, 8, 7);

        int max = list.stream()
                .max(Comparator.comparing(n -> n))
                .orElse(-1);

        System.out.println("Max Number: " + max);

        int min = list.stream()
                .min(Comparator.comparing(n -> n))
                .orElse(-1);

        System.out.println("Min Number: " + min);

        System.out.println("Max Number: " + list.stream().sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println("Min Number: " + list.stream().sorted().findFirst().get());
    }
}