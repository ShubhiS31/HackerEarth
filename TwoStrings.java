import java.util.Arrays;
import java.util.Scanner;

public class TwoStrings {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();

        for (int j = 0; j < T; j++) {
            String s1 = s.next();
            String s2 = s.next();

            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            String S3 = new String(arr1);
            String S4 = new String(arr2);

            if (S3.equals(S4))
                System.out.println("YES");

            else
                System.out.println("NO");

        }
    }
}
