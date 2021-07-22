public class PrintKeypadCombination{
    public static void main(String[]args){
        String s = "23";
        printKPC(s, "");
    }
    static String[] codes = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

    public static void printKPC(String ques, String ans){
        if(ques.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1); //roq --> remaining of question
        //codes for character = codesforch
        String codesforch = codes[ch-'0'];
        for(int i = 0; i < codesforch.length(); i++){
            char cho = codesforch.charAt(i); //cho --> char option
            printKPC(roq,ans+cho);
        }
    }
}