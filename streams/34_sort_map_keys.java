import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Solution {

    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(101, 2);
        map.put(1, 1);
        map.put(5, 3);
        map.put(9, 7);

        Map<Integer, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey()))
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue(), (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        System.out.println(sorted);

        Map<Integer, Integer> sorted1 = map.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue(), (oldVal, newVal) -> oldVal, TreeMap::new));

        System.out.println(sorted1);

    }
}