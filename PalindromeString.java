import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i))
                flag = false;
        }

        if (!flag) System.out.println("NO");
        else System.out.println("YES");
    }
}
