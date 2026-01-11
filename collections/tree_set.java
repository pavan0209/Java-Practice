/*
    1. Do not contain duplicates.
    2. stores data in sorted order. 
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(210);
        set.add(420);
        set.add(210);
        set.add(120);

        System.out.println(set);
    }
}