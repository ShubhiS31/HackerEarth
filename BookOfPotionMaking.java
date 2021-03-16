import java.util.Scanner;

public class BookOfPotionMaking {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        String num = s.nextLine();
        int sum = 0;

        if (num.length() == 10) {

            char[] numArr = num.toCharArray();

            for (int i = 0; i < numArr.length; i++)
                sum = sum + Character.getNumericValue(numArr[i]) * (i + 1);

            if (sum % 11 == 0)
                System.out.println("Legal ISBN");
            else
                System.out.println("Illegal ISBN");
        } else
            System.out.println("Illegal ISBN");
    }
}
