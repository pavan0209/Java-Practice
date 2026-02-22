import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(20, 39, 1, 2, 4, 6, 15);
        int target = 10;

        List<Integer> res = list.stream()
                .filter(num -> num > target)
                .collect(Collectors.toList());

        System.out.println("Numbers greater than " + target + " : " + res);
    }
}