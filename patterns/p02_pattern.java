package patterns;

import java.util.Scanner;

/*
Inverted Left Aligned Number Triangle

1 2 3 4 5
1 2 3 4
1 2 3 
1 2 
1

*/

class Solution {

    static void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i + 1; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        printPattern(rows);

        sc.close();
    }
}