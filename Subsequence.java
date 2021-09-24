
public class Subsequence {

    public boolean isSubseq(String str, String seq) {
        int i = 0;
        int j = 0;
        while (i < str.length() && j < seq.length()) {
            if (str.charAt(i) == seq.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == seq.length();
    }

    public static void main(String[] args) {
        Subsequence s = new Subsequence();
        if (s.isSubseq("abcde", "ace"))
            System.out.println("is a subsequence");
        else
            System.out.println("not a subsequence");
    }
}
