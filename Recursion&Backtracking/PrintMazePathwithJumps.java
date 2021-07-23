public class PrintMazePathwithJumps {
    public static void main(String[] args) {
        int m = 3; // destination row
        int n = 3; // destination column
        //maze start index 1 based
        printMazePathswithJumps(1, 1, m, n,"");
    }

    //psf --> path so far
    static void printMazePathswithJumps(int sr, int sc, int dr, int dc, String psf){

        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }

        //horizontal
        for(int ms = 1; ms <= dc-sc; ms++){
            printMazePathswithJumps(sr, sc+ms, dr, dc, psf+"h"+ms);
        }

        //vertical
        for(int ms = 1; ms <= dr-sr; ms++){
            printMazePathswithJumps(sr+ms, sc, dr, dc, psf+"v"+ms);
        }

        //diagonal
        for(int ms = 1; ms <= dc-sc && ms <= dr-sr; ms++){
            printMazePathswithJumps(sr+ms, sc+ms, dr, dc, psf+"d"+ms);
        }
    }
}
