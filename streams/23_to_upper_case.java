import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("pavan", "ganesh", "rushi", "DIpak", "Prasad");

        List<String> res = list.stream()
                .map(str -> str.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(res);
    }
}