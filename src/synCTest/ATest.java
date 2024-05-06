package synCTest;

public class ATest {
    public static void main(String[] args) {
        String s="Online java Compiler";
        String [] word=s.split(" ");
        String rev="";

        for(int i=(word.length)-1; i>=0;i--) rev = rev + word[i] + " ";
        System.out.println(rev);

    }
}
