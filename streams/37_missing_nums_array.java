import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {

        int[] arr = { 4, 6, 7, 10, 15, 17 };
        int target = 20;

        // way - 1
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();

        for (int num : arr)
            set.add(num);

        for (int i = 1; i <= target; i++) {
            if (!set.contains(i)) {
                res.add(i);
            }
        }

        System.out.println(res);

        // way - 2 using streams
        Set<Integer> set1 = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> missingNumbers = IntStream.rangeClosed(1, target)
                .filter(i -> !set1.contains(i))
                .boxed()
                .toList();

        System.out.println(missingNumbers);

        // way - 3
        Map<Boolean, List<Integer>> result = IntStream.rangeClosed(1, target)
                .boxed()
                .collect(Collectors.partitioningBy(
                        i -> Arrays.stream(arr).anyMatch(x -> x == i)));

        List<Integer> missing = result.get(false);
        System.out.println(missing);
    }
}