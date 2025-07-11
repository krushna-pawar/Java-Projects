import java.util.Scanner;

public class BasicCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;

        while (true) {
            System.out.println("Enter Operator : ");

            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.println("Enter First Number : ");
                int n1 = in.nextInt();
                System.out.println("Enter Second Number : ");
                int n2 = in.nextInt();

                if (op == '+') {
                    answer = n1 + n2;
                }

                if (op == '-') {
                    answer = n1 - n2;
                }
                if (op == '*') {
                    answer = n1 * n2;
                }
                if (op == '/') {
                    if (n2 != 0) {
                        answer = n1 / n2;
                    }
                }
                if (op == '%') {
                    answer = n1 - n2;
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Input Error");
            }
            System.out.println(answer);
        }
    }
}