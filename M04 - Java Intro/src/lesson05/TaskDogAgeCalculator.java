import java.util.Scanner;

public class TaskDogAgeCalculator {

    /*
    1) CALCULADORA DE EDAD DE PERROS:
    Pídele al usuario que ingrese la edad de su perro.
    Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

    public TaskDogAgeCalculator(){
    }
    */

    public static void main( String[] args ) {
        System.out.println( "Enter the dog's age: " );
        Scanner scanner = new Scanner( System.in );

        Integer dogAge = Integer.parseInt( scanner.nextLine() ) * 7;
        System.out.println( "The dog's age is: " + dogAge );
    }

}
