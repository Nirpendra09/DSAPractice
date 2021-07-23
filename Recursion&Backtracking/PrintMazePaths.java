public class PrintMazePaths {
    public static void main(String[] args) {
        int m = 3; // destination row
        int n = 3; // destination column
        //maze start index 1 based
        printMazePaths(1, 1, m, n,"");
    }
    //psf --> path so far
    
    static void printMazePaths(int sr, int sc, int dr, int dc, String psf){
        if(sr > dr || sc > dc){
            return;
        }
        if(sr == dr && sc == dc){
           System.out.println(psf);
            return;
        }

        printMazePaths(sr, sc + 1, dr, dc, psf+"h");
        printMazePaths(sr+1, sc, dr, dc, psf+"v");
    }
}
