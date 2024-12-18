package src.csesproblems;

import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the range (n)  of numbers: ");
        int N = scanner.nextInt();

        System.out.println("Please enter numbers where we find the ");
        int[] Numbers = new int[N - 1];

        for (int i = 0; i < N - 1; i++) {
            Numbers[i] = scanner.nextInt();
        }
        System.out.println(getMovesOfIncreasingArray(N, Numbers));
    }

    static int getMovesOfIncreasingArray(int N, int[] Numbers){
        int moves =0;
        for(int i = 1; i <Numbers.length ; i++){
            if(Numbers[i]  < Numbers[i-1]){
                moves +=  Numbers[i-1]  - Numbers[i]  ;
                Numbers[i] = Numbers[i -1];
            }
        }
        return moves;
    }
}


/*
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.
On each move, you may increase the value of any element by one. What is the minimum number of moves required?

Input:
The first input line contains an integer n: the size of the array.
Then, the second line contains n integers x_1,x_2,...,x_n: the contents of the array.

Output:
Print the minimum number of moves.

Constraints:
1 ≤ n ≤ 2 * 10^5
1 ≤ x_i ≤ 10^9

Example:

Input:
5
3 2 5 1 7

Output:
5
*/
