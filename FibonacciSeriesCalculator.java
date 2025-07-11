import java.util.Scanner;

public class FibonacciSeriesCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int user_input = input.nextInt();

        if (user_input == 0) {
            System.out.println(0);
        }

        else if (user_input == 1) {
            System.out.println(1);
        } else {
            int first_digit = 0;
            int second_digit = 1;

            int counter = 2;

            while (counter <= user_input) {
                int temp = second_digit;
                second_digit = second_digit + first_digit;
                first_digit = temp;
                counter++;
            }
            System.out.println(second_digit);
        }
    }
}