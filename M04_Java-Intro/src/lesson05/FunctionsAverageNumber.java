import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class FunctionsAverageNumber {
    /*
        1) Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.
        2) Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.
        3) Ahora, hay que mostrar el promedio. Para hacer esto se suman todos los números y se divide por 5, ya que el usuario agregó 5 números.
    */

    public static void main( String args[] ) {
        System.out.println( "JHS" );
        double[] givenNumbers = new double[ 5 ];
        storeNumbers( givenNumbers );
        showNumbers( givenNumbers );
        averageNumbers( givenNumbers );
        showMinMaxNumbers( givenNumbers );
    }

    private static double userRequestNumber() {
        Scanner scanner = new Scanner( System.in );
        return scanner.nextDouble();
    }

    private static void storeNumbers( double[] numbersCollection ) {
        for( int i = 0; i < numbersCollection.length; i++ ) {
            System.out.print( "Type a number: " );
            numbersCollection[ i ] = userRequestNumber();
        }
    }

    private static void showNumbers( double[] numbersCollection ) {
        System.out.println( "The given Numbers are: " + ( Arrays.toString( numbersCollection ) ) );
        // for( int i = 0; i < numbersCollection.length; i++ ) {
        //     System.out.print ( "\t" + numbersCollection[ i ] );
        // }
    }

    private static void averageNumbers( double[] numbersCollection  ) {
        double totalAverage = 0;
        for( int i = 0; i < numbersCollection.length; i++ ) {
            totalAverage += numbersCollection[ i ];
        }
        System.out.println( "The Numbers Average is: " + totalAverage / numbersCollection.length );
    }

    private static void showMinMaxNumbers( double[] numbersCollection ) {
        Arrays.sort( numbersCollection );
        System.out.println( "The Minimum value Number is: " + numbersCollection[ 0 ] + "\nThe Maximum value Number is " + numbersCollection[ numbersCollection.length - 1 ] );
    }



}
