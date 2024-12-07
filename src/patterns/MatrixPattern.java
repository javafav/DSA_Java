package src.patterns;

import java.util.Scanner;

/*
Input Format: N = 3
Result:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3

Input Format: N = 6
Result:
6 6 6 6 6 6 6 6 6 6 6
6 5 5 5 5 5 5 5 5 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 2 1 2 3 4 5 6
6 5 4 3 2 2 2 3 4 5 6
6 5 4 3 3 3 3 3 4 5 6
6 5 4 4 4 4 4 4 4 5 6
6 5 5 5 5 5 5 5 5 5 6
6 6 6 6 6 6 6 6 6 6 6
*/


//How Can We Solve this
//below is the Algo

/*
Top Edge: i
This represents how far down the current cell is from the top row.
Example:
If you're on the first row (i = 0), the distance to the top is 0.
If you're on the second row (i = 1), the distance is 1.
The value of i directly tells you the distance from the top.

Bottom Edge: size - 1 - i
This calculates how far the current cell is from the bottom row.
Why size - 1 - i?
size - 1 gives the index of the last row.
Subtract i to measure the gap from the current row to the last row.
Example:
In a 5x5 matrix (size = 5):
If you're on the first row (i = 0), distance to the bottom = 5 - 1 - 0 = 4.
If you're on the last row (i = 4), distance to the bottom = 5 - 1 - 4 = 0.

Left Edge: j
This represents how far the current cell is from the leftmost column.
Example:
If you're in the first column (j = 0), distance = 0.
If you're in the second column (j = 1), distance = 1.

Right Edge: size - 1 - j
This calculates how far the current cell is from the rightmost column.
Why size - 1 - j?
size - 1 gives the index of the last column.
Subtract j to measure the gap from the current column to the last column.
*/

public class MatrixPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter the number that you want to run the pattern: ");
        int numberOfTimePrint = scanner.nextInt();
        printPattern(numberOfTimePrint);
    }

    static void printPattern(int N) {
        int size = 2 *N -1;
        for (int i = 0; i < size; i++) {// outer loop for rows

            for(int j =0;  j<size;j++){
                int top = i;
                int left = j;
                int bottom = size - 1 -i;
                int right = size -1-j;
                int minDistance = N - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(minDistance + " ");

            }
            System.out.println();

        }
    }
}
