import java.util.Arrays;
import java.util.List;

class Solution {

    static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 4, 6, 8);

        Boolean isContainsPrime = list.stream()
                .anyMatch(num -> isPrime(num));

        System.out.println(isContainsPrime);
    }
}