package patterns;

import java.util.Scanner;

/*
Left Aligned Character Triangle

A
A B
A B C 
A B C D
A B C D E

*/

class Solution {

    static void printPattern(int rows) {

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print((char) (64 + j) + " ");
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