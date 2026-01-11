/*
    HashMap
    1. Stores data in key, value pair.
    2. Do not preserve insertion order.
    3. Do not allow duplicate keys.
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {

        Map<Integer, Integer> map = new HashMap<>();

        map.put(10, 1);
        map.put(20, 2);
        map.put(20, 3);
        map.put(30, 4);
        map.put(10, 5);

        System.out.println(map);

        System.out.println(map.getOrDefault(50, 0));
    }

}