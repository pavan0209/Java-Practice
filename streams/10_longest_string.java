import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Pavan", "Ganesh", "Prasad", "Rushikesh");

        list.stream().min(Comparator.comparing(s -> s.length()))
                .ifPresent(s -> System.out.println(s));
    }
}