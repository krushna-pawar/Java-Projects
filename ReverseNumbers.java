import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int input = in.nextInt();
        int output = 0;

        while ( input > 0 ) {
            int rem = input % 10;
            input /= 10;
            output = 10 * output + rem;
        }
        System.out.println(output);
    }
}
