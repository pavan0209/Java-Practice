import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Streams", "API", "Test", "Pos", "SAP");

        Map<Integer, List<String>> map = list.stream()
                .collect(Collectors.groupingBy(str -> str.length()));

        System.out.println(map);
    }
}