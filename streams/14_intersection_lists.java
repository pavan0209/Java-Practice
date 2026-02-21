import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 10, 7);
        List<Integer> list2 = Arrays.asList(2, 4, 6, 8, 10, 5, 7, 7);

        List<Integer> res = list1.stream().filter(num -> list2.contains(num))
                .distinct()
                .collect(Collectors.toList());

        System.out.println(res);
    }
}