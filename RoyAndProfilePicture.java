import java.util.Scanner;

public class RoyAndProfilePicture {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int L = s.nextInt();
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {

            int W = s.nextInt();
            int H = s.nextInt();

            if (W < L || H < L) System.out.println("UPLOAD ANOTHER");
            else {
                if (W == H) System.out.println("ACCEPTED");
                else System.out.println("CROP IT");
            }
        }
    }
}
