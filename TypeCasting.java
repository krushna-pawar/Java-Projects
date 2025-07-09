import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

    Scanner input = new Scanner(System .in);


        System.out.println("Enter Byte :");
        byte b = input.nextByte();

        System.out.println("Enter A Character");
        char c = input.next().charAt(0);

        System.out.println("Enter Int :");
        int i = input.nextInt();

        System.out.println("Enter Float :");
        float f = input.nextFloat();

        System.out.println("Enter A Double :");
        double d = input.nextDouble();

        double converted = (b * c) / (i - f)+ d ;
        System.out.println(converted);

    }
}
