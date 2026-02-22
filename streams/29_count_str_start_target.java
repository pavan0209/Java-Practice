import java.util.Arrays;
import java.util.List;

class Solution {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pavan", "Pranav", "Prasad", "Dipak", "Ganesh");
        String target = "P";

        long res = list.stream()
                .filter(str -> str.startsWith(target))
                .count();

        System.out.println("Number of strings starting with " + target + " : " + res);
    }
}