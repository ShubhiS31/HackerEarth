import java.util.Scanner;

public class Ladderophilia {

    public static void main(String args[]) throws Exception {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        for (int j = 0; j < num; j++) {

            for (int i = 0; i < 2; i++)
                System.out.println("*   *");

            System.out.println("*****");
        }

        for (int i = 0; i < 2; i++)
            System.out.println("*   *");
    }
}
