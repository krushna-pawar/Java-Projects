import java.util.Scanner;


public class WhichIsTheBiggerNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First No :");
        double a = input.nextDouble();

        System.out.println("Enter Second No :");
        double b = input.nextDouble();

        if (a>b)
            System.out.println(a);

        if (b>a)
            System.out.println(b);
    }
}
