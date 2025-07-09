public class AutomaticTypePromotionsInExpressions {

    public static void main(String[] args) {


        byte a = 20;
        byte b = 50;
        byte c = 50;

        int d = (a * b) / c;

        System.out.println(d);
    }
}