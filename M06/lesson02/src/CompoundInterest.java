import java.util.Scanner;

public class CompoundInterest {

    public CompoundInterest() {}

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );

        float initialCapital;
        float annualAddition;
        float totalYears;
        float interestRate;
        float totalEarnings;

        System.out.print( "Type initial capital: " );
        initialCapital = scanner.nextFloat();

        System.out.print( "Type annual addition: " );
        annualAddition = scanner.nextFloat();

        System.out.print( "Type total years: " );
        totalYears = scanner.nextFloat();

        System.out.print( "Type interest rate: " );
        interestRate = scanner.nextFloat();

        totalEarnings = initialCapital;

        for( int i = 0; i < totalYears; i++ ) {
            totalEarnings += annualAddition;
            totalEarnings += totalEarnings * interestRate / 100;
        }

        // monto = capital( tasa / 100 + 1 ) ^ tiempo;

        System.out.println( "Your total earnings will be: " + totalEarnings );


    }

}
