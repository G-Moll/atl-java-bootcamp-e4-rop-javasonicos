import java.util.Scanner;

public class TaskMiles2Kilometers {


    /*
    2) Conversor de millas a kilómetros:
    Pídele al usuario que ingrese una distancia en millas.
    Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
    Muestra la distancia en kilómetros al usuario.

    public TaskMiles2Kilometers(){
    }
    */

    public static void main(String[] args){

        System.out.println( "Enter the distance in miles: " );
        Scanner scanner = new Scanner( System.in );

        Double distanceKilometers = Double.parseDouble( scanner.nextLine() ) * 1.60934;
        System.out.println( "The distance from miles to kilometers is: " + distanceKilometers );
    }

}
