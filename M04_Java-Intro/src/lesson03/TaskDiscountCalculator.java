import java.util.Scanner;

public class TaskDiscountCalculator {
    /*
    3) Calculadora de descuento:
    Pídele al usuario que ingrese el precio original de un producto.
    Pídele al usuario que ingrese el porcentaje de descuento.
    Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
    Muestra el precio final al usuario.

    public DiscountCalculator(){
    }
    */

    public static void main(String[] args){
        Scanner scanner = new Scanner( System.in );

        System.out.println( "Enter the product price: " );
        Double productPrice = Double.parseDouble( scanner.nextLine() );

        System.out.println( "Enter the product discount: " );
        Double productDiscount = Double.parseDouble( scanner.nextLine() );

        Double finalPrice = productPrice - ( productPrice * productDiscount / 100 );
        System.out.println( "The final price is: " + finalPrice );
    }
}
