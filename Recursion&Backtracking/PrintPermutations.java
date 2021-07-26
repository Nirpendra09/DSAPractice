
public class PrintPermutations{
    public static void main(String []args){
        String s = "abc";
        printPermutations(s, "");
    }

    //asf --> answer so far
    public static void printPermutations(String ques, String asf){

        if(ques.length() == 0){
            System.out.println(asf);
        }

        for(int i = 0; i < ques.length(); i++){
            char ch = ques.charAt(i);
            //qlpart -> question left part
            String qlpart = ques.substring(0,i); //substring includes only till the last range-1
            //qrpart -> question right part
            String qrpart = ques.substring(i+1);
            String roq = qlpart+qrpart;
            printPermutations(roq, asf+ch);
        }
    }
}