import java.util.Scanner;


public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        double d = input.nextDouble();

        if (d % 2 == 0)
            System.out.println("The number is even.");

        else
            System.out.println("The number is odd.");


    }


}
