import java.util.*;
public class PileEqualHeight{
    public static void main(String[] args) {
        int[] pile = {5,5,2,1};
        System.out.println( minSteps(pile));
    }
    public static int minSteps(int[]pile){
        Arrays.sort(pile);
        int res = 0;
        int distinctNum = 0;
        for(int i = 1; i < pile.length ; i++){
            if(pile[i] == pile[i-1]){
                res += distinctNum;
            }
            else{
                distinctNum++;
                res += distinctNum;
            }
        }
        return res;
    }
}