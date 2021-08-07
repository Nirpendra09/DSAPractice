package RecursionNBacktracking;

//        1. You are give a number of boxes (nboxes) and number of identical items (ritems).
//        2. You are required to place the items in those boxes and print all such configurations possible.
//
//        Items are identical and all of them are named 'i'
//        Note - Number of boxes is greater than number of items, hence some of the boxes may remain empty.

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Combinations2 {
    //ci -> current item, ti -> total item, llb -> last level box
    public static void combinations(boolean[]boxes, int ci, int ti, int llb){
        if(ci > ti){
            for (int i = 0; i < boxes.length; i++) {
                if(boxes[i]){
                    System.out.print("i");
                }
                else{
                    System.out.print("-");
                }
            }
            System.out.println();
            return;
        }
        for(int b = llb+1; b < boxes.length; b++){
            if(boxes[b] == false) {
                boxes[b] = true;
                combinations(boxes, ci + 1, ti, b);
                boxes[b] = false;
            }
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nboxes = Integer.parseInt(br.readLine());
        int ritems = Integer.parseInt(br.readLine());
        combinations(new boolean[nboxes], 1, ritems, -1);
    }
}
