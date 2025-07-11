import java.util.Scanner;

public class IsItCapital {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char a = input.next().trim().charAt(0);

        if (a >= 'a' && a <= 'z') {
            System.out.println("Lowercase");
        } else
            System.out.println("Uppercase");
    }
} 