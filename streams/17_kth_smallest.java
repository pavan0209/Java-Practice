import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 10, 5, 6, 8, 11, 2, 7);
        int k = 9;

        int res = list.stream()
                .distinct()
                .sorted()
                .skip(k - 1)
                .findFirst()
                .orElse(-1);

        System.out.println(res);

        int[] arr = { 1, 4, 10, 5, 6, 8, 11, 2, 7 };

        Arrays.stream(arr)
                .sorted()
                .skip(k - 1)
                .findFirst()
                .ifPresent(num -> System.out.println("Kth Smallest number: " + num));
    }
}