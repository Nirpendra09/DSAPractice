package RecursionNBacktracking;
//Queen chooses -- similar queens(combinations)

//        1. You are given a number n, representing the size of a n * n chess board.
//        2. You are required to calculate and print the combinations in which n queens can be placed on the n * n chess-board.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class QueenCombinations4 {
    //i -> prev queens row, j -> prev queens col
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int i, int j){
        if(qpsf == tq){
            for (int row = 0; row < chess.length; row++) {
                for (int col = 0; col < chess.length; col++) {
                    if(chess[row][col] == true){
                        System.out.print("q\t");
                    }
                    else{
                        System.out.print("-\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
            return;
        }

        // jis row me pichli queen bithaya uske bache hue col
        for (int col = j+1; col < chess.length; col++) {
            chess[i][col] = true;
            queensCombinations(qpsf+1, tq, chess, i, col);
            chess[i][col] = false;
        }

        //baki sare row col
        for (int row = i+1; row < chess.length; row++) {
            for (int col = 0; col < chess.length; col++) {
                chess[i][col] = true;
                queensCombinations(qpsf+1, tq, chess, row, col);
                chess[i][col] = false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, 0, -1);
    }
}
