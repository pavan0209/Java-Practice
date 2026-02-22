import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
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

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a, b) -> Integer.compare(a.getValue(), b.getValue()));
        Map<Integer, Integer> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        System.out.println(sortedMap);

        Map<Integer, Integer> sorted = map.entrySet().stream()
                .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue(), (oldVal, newVal) -> oldVal, LinkedHashMap::new));

        System.out.println(sorted);

    }
}