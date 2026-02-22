import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {

    static String printSortedOrNot(boolean isSorted) {

        if (isSorted)
            return "Array is in sorted order";
        else
            return "Array is not in sorted order";
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 6, 8, 9 };

        // way - 1
        boolean isSorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(printSortedOrNot(isSorted));

        // way - 2
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        System.out.println(printSortedOrNot(Arrays.equals(arr, sorted)));

        // way - 3 stream api
        isSorted = IntStream.range(0, arr.length - 1)
                .noneMatch(i -> arr[i] > arr[i + 1]);
        System.out.println(printSortedOrNot(isSorted));

        // way - 4 stream api
        isSorted = IntStream.range(0, arr.length - 1)
                .allMatch(i -> arr[i] <= arr[i + 1]);
        System.out.println(printSortedOrNot(isSorted));

        // way - 5 stream api
        System.out.println(printSortedOrNot(Arrays.equals(arr, Arrays.stream(arr)
                .sorted().toArray())));
    }
}