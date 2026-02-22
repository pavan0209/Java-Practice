import java.util.List;
import java.util.stream.Stream;

class Solution {

    public static void main(String[] args) {

        int[] fib = { 0, 1 };
        int n = 10;

        List<Integer> list = Stream.generate(() -> {
            int next = fib[0];
            int sum = fib[0] + fib[1];
            fib[0] = fib[1];
            fib[1] = sum;
            return next;
        }).limit(n).toList();

        System.out.println(list);
    }
}