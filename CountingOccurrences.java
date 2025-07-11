import java.util.Scanner;

public class CountingOccurrences {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int user_input = input.nextInt();

        int zero = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;



        while ( user_input > 0 ) {
            int remainder= user_input % 10;

                if ( remainder == 0) {
                    zero++;
                    }

                if ( remainder == 1 ) {
                    one++;
                }

                if (remainder == 2 ) {
                    two++;
                }

                if (remainder == 3 ){
                    three++;
                }

                if (remainder == 4) {
                four++;
                }
                if (remainder == 5) {
                five++;
                }
                if (remainder == 6) {
                six++;
                }
                if (remainder == 7) {
                seven++;
                }
                if (remainder == 8) {
                eight++;
                }
                if (remainder == 9) {
                nine++;
                }

            user_input /= 10;

        }
        System.out.println("Number of Zeros  : " + zero );
        System.out.println("Number of Ones   : " + one );
        System.out.println("Number of Twos   : " + two );
        System.out.println("Number of Threes : " + three );
        System.out.println("Number of fours  : " + four );
        System.out.println("Number of Fives  : " + five );
        System.out.println("Number of Sixes  : " + six);
        System.out.println("Number of Sevens : " + seven);
        System.out.println("Number of Eights : " + eight);
        System.out.println("Number of Nines  : " + nine);
    }
}

