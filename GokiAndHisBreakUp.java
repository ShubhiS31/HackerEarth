import java.util.Scanner;

public class GokiAndHisBreakUp {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();

        for (int i = 0; i < N; i++) {

            int Y = s.nextInt();
            if (Y >= X)
                System.out.println("YES");

            else
                System.out.println("NO");

        }
    }
}
