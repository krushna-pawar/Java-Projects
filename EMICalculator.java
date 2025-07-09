import java.util.Scanner;

public class EMICalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Loan amount :");
        double P = input.nextDouble();

        System.out.println("Enter Annual Interest Rate :");
        double annual_rate = input.nextDouble();
        double r = annual_rate / 12 / 100 ;

        System.out.println("Loan Tenure :");
        double tenure = input.nextDouble();

        double n = (tenure * 12);

        double EMI = (P * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);

        System.out.println("Your EMI will be = " + EMI );


    }
}