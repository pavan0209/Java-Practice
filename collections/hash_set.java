/*
    1. Do not contain duplicates.
    2. Do not preserve insertion order. 
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(40);
        set.add(20);
        set.add(60);

        System.out.println(set);
    }
}