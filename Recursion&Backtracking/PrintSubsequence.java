

public class PrintSubsequence{
    public static void main(String []args){
        String s = "yvTA";
            printSS(s,"");
    }

    public static void printSS(String ques, String ans){

        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }

        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        printSS(roq, ans+ch);
        printSS(roq, ans+"");
    }
}