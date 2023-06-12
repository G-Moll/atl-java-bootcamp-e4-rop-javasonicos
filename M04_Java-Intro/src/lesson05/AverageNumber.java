import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class AverageNumber {
    /*
        Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.

        Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.

        Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
    */

    public static void main( String args[] ) {
        int counter = 0;
        int limit = 5;
        double typedNumber;
        double totalAverage = 0;
        double numbersArray[] = new double[ 5 ];
        Scanner scanner = new Scanner( System.in );

        // Type numbers by the user
        System.out.println( "Please type 5 single values" );
        while( counter < limit ) {

            System.out.print( "Type a number (Intent " + ( counter + 1 ) + "): " );
            typedNumber = scanner.nextDouble();
            totalAverage += typedNumber;

            numbersArray[ counter ] = typedNumber;
            counter++;
        }

        // Given numbers by the user
        System.out.print( "\nThe given numbers are:\t" );
        for( int currentNumber = 0;  currentNumber < numbersArray.length; currentNumber++ ) {
            System.out.print( numbersArray[ currentNumber ] + "\t"  );
        }

        // Numbers Average
        System.out.println( "\nThe numbers average is:\t" + ( totalAverage / limit ) );

        // Min and Max Numbers
        Arrays.sort( numbersArray );
        System.out.println( "The min value is:\t" + numbersArray[ 0 ] );
        System.out.println( "The max value is:\t" + numbersArray[ numbersArray.length -1 ] );
    }
}
