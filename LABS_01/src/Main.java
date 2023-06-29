import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String people[] = { "JHS", "Pedro", "Pablo", "Juan", "Mateo", "Lucas", "Marcos" };
        System.out.println( "Type your search" );
        Scanner scanner = new Scanner( System.in );
        String dataSearch = scanner.nextLine();

        for( String personName : people ) {
            if( personName.toLowerCase().contains( dataSearch.toLowerCase() ) ) {
                System.out.println( "The found person is " + personName );
            }
        }
    }

}
