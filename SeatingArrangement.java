import java.util.Scanner;

public class SeatingArrangement {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int rem = 0;

        for (int i = 0; i < T; i++) {

            int N = s.nextInt();
            rem = N % 12;
            switch (rem) {

                case 0:
                    System.out.println(N - 11 + " WS");
                    break;

                case 1:
                    System.out.println(N + 11 + " WS");
                    break;

                case 2:
                    System.out.println(N + 9 + " MS");
                    break;

                case 3:
                    System.out.println(N + 7 + " AS");
                    break;

                case 4:
                    System.out.println(N + 5 + " AS");
                    break;

                case 5:
                    System.out.println(N + 3 + " MS");
                    break;

                case 6:
                    System.out.println(N + 1 + " WS");
                    break;

                case 7:
                    System.out.println(N - 1 + " WS");
                    break;

                case 8:
                    System.out.println(N - 3 + " MS");
                    break;

                case 9:
                    System.out.println(N - 5 + " AS");
                    break;

                case 10:
                    System.out.println(N - 7 + " AS");
                    break;

                case 11:
                    System.out.println(N - 9 + " MS");
                    break;
            }
        }
    }
}
