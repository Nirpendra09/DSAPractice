package RecursionNBacktracking;
//Queen chooses - 3

import java.io.BufferedReader;
import java.io.InputStreamReader;

//        1. You are given a number n, representing the size of a n * n chess board.
//        2. You are required to calculate and print the combinations in which n queens can be placed on the n * n chess-board.


// **** 2d as 1d ****

// *** General Formulas ****
//      row No. = cell no. / length of row
//      col No. = cell no. % length of col
//      cell No. =  row No. * length + col

public class QueenCombinations5 {
    // lcon -> last cell no (pichli rani yaha bithai)
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
        if(qpsf == tq){
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    if(chess[row][col] == true){
                        System.out.print("q\t");
                    }
                    else {
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        //                               **** 2d as 1d ****
        for (int cell = lcno + 1; cell < chess.length * chess.length; cell++) {
            int row = cell / chess.length;
            int col = cell % chess.length;
            
            chess[row][col] = true;
            queensCombinations(qpsf + 1, tq, chess, cell);
            chess[row][col] = false;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}
