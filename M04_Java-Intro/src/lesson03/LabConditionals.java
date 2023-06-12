import java.util.Scanner;

public class LabConditionals {

    public static void main( String[] args ) {
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Enter your age: " );

        // Integer age = Integer.parseInt( scanner.nextLine() );
        Integer age = scanner.nextInt();
        if( age >= 18 ) {
            System.out.println( "YOU ARE an Adult" );
        }
        else {
            System.out.println( "YOU ARE NOT an Adult" );
        }
    }

}
