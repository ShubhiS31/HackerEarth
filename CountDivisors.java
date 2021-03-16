import java.util.Scanner;

public class CountDivisors {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int k = s.nextInt();
        int div = 0;

        for (int i = l; i <= r; i++)
            if ((i % k) == 0)
                div++;

        System.out.println(div);
    }
}
