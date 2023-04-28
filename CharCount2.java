import java.util.*;

public class CharCount2 {

    public static void main(String[] argv)
    {
        char[] A = {'t', 'h', 'e', 'd', 'o', 'g', 'a', 't', 'e'};
        char[] B = {'m', 'y', 'h', 'o', 'm', 'e', 'w', 'o', 'r', 'k'};
        System.out.println( countFirstInSecond(A,B) );
    }

    static int countFirstInSecond (char[] A, char[] B)
    {
        // Use a hashset b/c it disallows duplicates
        HashSet<Character> onlyInA = new HashSet<Character>();
        for (int i=0; i<A.length; i++) {
            for (int j=0; j<B.length; j++) {
                if (A[i] == B[j]) {
                    onlyInA.add(A[i]);
                    break;
                }
            }
        }

        return onlyInA.size();
    }
}
