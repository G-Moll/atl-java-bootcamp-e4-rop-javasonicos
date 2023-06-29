import java.util.Scanner;

public class Main {

    public Main(){
    }

    public static void main(String[] args) {

        // Client client01 = new Client( /*"JHS", "Son of God", 33*/ );
        Client client01 = loadClient();
        client01.toString();

        Client client02 = loadClient();
        client02.toString();

    }

    private static Client loadClient() {
        Scanner scanner = new Scanner( System.in );
        Client temporalClient = new Client();

        System.out.println( "Please type the Client's Name" );
        temporalClient.name = scanner.nextLine();

        System.out.println( "Please type the Client's Lastname" );
        temporalClient.lastname = scanner.nextLine();

        System.out.println( "Please type the Client's age" );
        temporalClient.age = scanner.nextInt();

        return temporalClient;
    }

}


