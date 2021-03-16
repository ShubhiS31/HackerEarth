import java.util.Scanner;

public class PrimeNumber {

    static boolean checkPrime(int n) {

        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    public static void main(String[] args) throws Exception {

        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        boolean flag = false;

        for (int i = 2; i <= N; i++)
            if (checkPrime(i))
                System.out.print(i + " ");
    }
}
