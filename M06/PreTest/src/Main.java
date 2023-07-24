public class Main {

    // System.out.println( "JHS" );

    public static void main( String[] args ) {
        // singleNumberMultiples( 2, 1000 );
        // singleNumberMultiples( 8, 500 );
        // singleNumberMultiples( 23, 700 );
        // singleNumberMultiples( 50, 700 );

        partnerNumbersMultiples( 3, 5 , 1000 );
        // partnerNumbersMultiples( 23, 5 , 700 );

        commonNumbersMultiples( 3, 5 , 1000 );
    }

    public static void singleNumberMultiples( int baseNumber, int limitNumber ) {
        int sum = 0;

        for( int i = baseNumber; i < limitNumber; i += baseNumber ) {
            sum += i;
        }
        System.out.println( "SUMMING SINGLE NUMBER'S MULTIPLES (" + baseNumber + "), LIMITTING ON " + limitNumber );
        System.out.println( "The BASE NUMBER is " + baseNumber + "\nThe LIMIT NUMBER is " + limitNumber + " (Not taken), \nThe TOTAL SUM is " + sum + "\n" );
    }

    public static void partnerNumbersMultiples( int firstNumber, int secondNumber, int limitNumber ) {
        int sumFirstNumber = 0;
        int sumSecondNumber = 0;
        int minNumber = firstNumber < secondNumber ? firstNumber : secondNumber ;

        for( int i = minNumber; i < limitNumber; i++  ) {
            sumFirstNumber += i % firstNumber == 0 ? i : 0;
            sumSecondNumber += i % secondNumber == 0 ? i : 0;
        }
        System.out.println( "SUMMING 2 NUMBERS' MULTIPLES (" + firstNumber + ", " + secondNumber + "), LIMITTING ON " + limitNumber );
        System.out.println( "The FIRST NUMBER is " + firstNumber + "\nThe FIRST NUMBER SUM is " + sumFirstNumber + "\nThe SECOND NUMBER is " + secondNumber + "\nThe SECOND NUMBER SUM is " + sumSecondNumber + "\nThe BOTH NUMBERS SUM is " + ( sumFirstNumber + sumSecondNumber ) + "\n" );
    }

    public static void commonNumbersMultiples( int firstNumber, int secondNumber, int limitNumber ) {
        int sumFirstNumber = 0;
        int sumSecondNumber = 0;
        int sumCommonMultiples = 0;
        int minNumber = firstNumber < secondNumber ? firstNumber : secondNumber;

        for( int i = minNumber; i < limitNumber; i++ ) {
            sumFirstNumber += i % firstNumber == 0 ? i : 0;
            sumSecondNumber += i % secondNumber == 0 ? i : 0;
            sumCommonMultiples += ( i % firstNumber == 0 || i % secondNumber == 0 ) ? i : 0;
            // i
            // 6    6/3 2 0
            // 6    6/5 1 1
        }

        System.out.println( "SUMMING COMMON 2 NUMBERS' MULTIPLES (" + firstNumber + ", " + secondNumber + "), LIMITTING ON " + limitNumber );
        System.out.println( "The FIRST NUMBER is " + firstNumber + "\nThe FIRST NUMBER SUM is " + sumFirstNumber + "\nThe SECOND NUMBER is " + secondNumber + "\nThe SECOND NUMBER SUM is " + sumSecondNumber + "\nThe BOTH COMMON NUMBERS SUM is " + ( sumCommonMultiples ) + "\n" );
    }

}
