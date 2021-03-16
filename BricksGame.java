import java.util.Scanner;

public class BricksGame {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s = 0;
        for (int i = 1; i <= N; i++) {
            s = s + i;
            if (s >= N) {
                System.out.println("Patlu");
                break;
            }
            s = s + 2 * i;
            if (s >= N) {
                System.out.println("Motu");
                break;
            }
        }
    }
}
