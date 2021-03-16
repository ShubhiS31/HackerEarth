import java.util.*;

public class AmanAndMrSharma {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int toffees = 0;

        for (int i = 0; i < N; i++) {

            long r = s.nextLong();
            long x = s.nextLong();

            long distance = 700 * x;
            long circle = 44 * r;

            if (distance >= circle)
                toffees++;
        }

        System.out.println(toffees);
    }
}
