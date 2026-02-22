import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 10, 11, 3, 4, 5, 9, 8, 7);

        List<Integer> res = list.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());  

        System.out.println(res);
    }
}