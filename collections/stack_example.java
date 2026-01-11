/*
    Stack:: Last in first out structure (LIFO)
*/

import java.util.*;

class Solution {
    public static void main(String[] args) {

        Stack<Character> stk = new Stack<>();

        stk.push('A');
        stk.push('B');
        stk.push('C');
        stk.push('D');
        
        System.out.print("[");
        while (!stk.isEmpty()) {
            System.out.print(stk.pop() + ((stk.size() != 0) ? ", " : ""));
        }
        System.out.println("]");
    }
}