import java.util.*;
// 1. You are given a number n and a number m representing number of rows and columns in a maze.
// 2. You are standing in the top-left corner and have to reach the bottom-right corner. 
// 3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..). 
// 4. Complete the body of getMazePath function - without changing signature - to get the list of all paths that can be used to move from top-left to bottom-right.
// Use sample input and output to take idea about output.
public class GetMazePathswithJumps {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(getMazePaths(1, 1, m, n));
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        if(sr == dr && sc == dc){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

        ArrayList<String> paths = new ArrayList<>();
        //ms -> move size
        for(int ms = 1; ms <= dc - sc; ms++ ){
            ArrayList<String> hpaths = getMazePaths(sr, sc+ms, dr, dc);
            for(String hpath: hpaths){
                paths.add("h"+ms+hpath);
            }
        }

         //ms -> move size
         for(int ms = 1; ms <= dr - sr; ms++ ){
            ArrayList<String> vpaths = getMazePaths(sr+ms, sc, dr, dc);
            for(String vpath: vpaths){
                paths.add("h"+ms+vpath);
            }
        }

         //ms -> move size
         for(int ms = 1; ms <= dc - sc && ms <= dr- sr; ms++ ){
            ArrayList<String> dpaths = getMazePaths(sr+ms, sc+ms, dr, dc);
            for(String dpath: dpaths){
                paths.add("d"+ms+dpath);
            }
        }
        return paths;
    }
}
