import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1, 5, 6, 5);

        List<Integer> res = list.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(res);
    }
}