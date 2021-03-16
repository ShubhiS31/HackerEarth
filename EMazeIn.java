import java.util.Scanner;

public class EMazeIn {

    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'L') x--;
            else if (str.charAt(i) == 'R') x++;

            if (str.charAt(i) == 'D') y--;
            else if (str.charAt(i) == 'U') y++;
        }

        System.out.println(x + " " + y);

    }
}
