import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry",
                "banana", "apple");

        Map<String, Long> freq = words.stream()
                .collect(Collectors.groupingBy(key -> key, Collectors.counting()));

        System.out.println(freq);
    }
}