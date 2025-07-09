import java.util.Scanner;


public class TempConversionCToF {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Temp In Celsius :");

        float c = input.nextFloat();
        float d = (c*9/5)+32;

        System.out.println(d);
    }
}
