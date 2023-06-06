import java.util.Scanner;

public class TaskTipCalculator {

    /*
    4) Calculadora de propinas:
    Pídele al usuario que ingrese el total de la cuenta en un restaurante.
    Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
    Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

    public TaskTipCalculator(){
    }
    */

    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Enter the bill amount: " );
        Double billAmount = Double.parseDouble( scanner.nextLine() );

        System.out.println( "Enter the tip amount: " );
        Double tipAmount = Double.parseDouble( scanner.nextLine() );

        Double finalTip = billAmount * ( tipAmount / 100 );
        System.out.println( "The final price is: " + finalTip );
    }

}
