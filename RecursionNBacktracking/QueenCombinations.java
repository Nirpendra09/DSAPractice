package RecursionNBacktracking;

//1. You are given a number n, representing the size of a n * n chess board.
//        2. You are required to calculate and print the combinations in which n queens can be placed on the n * n chess-board.

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Box chooses
public class QueenCombinations {
    //qpsf -> queen placed so far, tq -> total queens
    public static void queensCombinations(int qpsf, int tq, int row, int col, String asf) {
        if (row == tq) {
            if (qpsf == tq) {
                System.out.println(asf);
            }
            return;
        }
        int nr = 0;
        int nc = 0;
        String yasf = ""; // yes answer so far
        String nasf = ""; // No answer so far
        if (col == tq - 1) {
            nr = row + 1;
            nc = 0;
            yasf = asf + "q\n";
            nasf = asf + "-\n";
        } else {
            nr = row;
            nc = col + 1;
            yasf = asf + "q";
            nasf = asf + "-";
        }
        queensCombinations(qpsf + 1, tq, nr, nc, yasf);
        queensCombinations(qpsf + 0, tq, nr, nc, nasf);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        queensCombinations(0, n, 0, 0, "");
    }
}
