import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        String str = "Pavan Sonawane pavan";

        Map<Character, Long> freq = str.toLowerCase()
                .chars()
                .mapToObj(c -> (char) (c))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(freq);
    }
}