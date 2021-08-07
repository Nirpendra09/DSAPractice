package RecursionNBacktracking;
//box chooses - 2

import java.io.BufferedReader;
import java.io.InputStreamReader;

//        1. You are given a number n, representing the size of a n * n chess board.
//        2. You are required to calculate and print the permutations in which n queens can be placed on the
//        n * n chess-board.

public class QueenCombinations3 {
    public static void queensPermutations(int qpsf, int tq, int row, int col, String asf, boolean[] queens) {
        // write your code here
        if(row == tq) {
            if (qpsf == tq) {
                System.out.println(asf);
                System.out.println();
            }
            return;
        }
        int nr = 0;
        int nc = 0;
        char sep = '\0';
        if(col == tq - 1){
            nr = row + 1;
            nc = 0;
            sep = '\n';
        }
        else{
            nr = row;
            nc = col + 1;
            sep= '\t';
        }

        for (int i = 0; i < queens.length; i++) {
            if(queens[i] == false){
                queens[i] = true;
                queensPermutations(qpsf +1, tq, nr, nc, asf+ "q"+(i+1) + sep, queens); //queen baith jayegi
                queens[i] = false;
            }
        }
        queensPermutations(qpsf +0, tq, nr, nc, asf+ "-" + sep, queens); //queens ni bithare

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[] queens = new boolean[n];

        queensPermutations(0, n, 0, 0, "", queens);
    }
}
