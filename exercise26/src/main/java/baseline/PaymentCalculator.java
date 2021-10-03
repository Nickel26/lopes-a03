package baseline;

public class PaymentCalculator {

    public static double calculateMonthsUntilPaidOff() {
        //calculates how many months until card is paid off using formula
        double n;

        Solution26.i = (Solution26.i * .01) / 365.0;

        n = - ( 1.0 / 30.0 ) * Math.log( 1.0 + ( Solution26.b / Solution26.p ) * ( 1.0 - Math.pow(( 1.0 + Solution26.i ), 30.0))) / Math.log( 1.0 + Solution26.i );
        n = Math.ceil(n);

        return n;
    }

}
