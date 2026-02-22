import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5));

        List<Integer> res = list.stream()
                .flatMap(lst -> lst.stream())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}