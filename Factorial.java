import java.util.Scanner;

public class Factorial {

    public int cal_factorial(int N) {

        if (N == 0 || N == 1)
            return 1;

        return N * cal_factorial(N - 1);
    }

    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        Factorial sol = new Factorial();
        System.out.print(sol.cal_factorial(N));

    }
}
