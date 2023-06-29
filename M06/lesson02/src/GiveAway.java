import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

import models.Giver;

public class GiveAway {

    public static void main(String[] args){

        System.out.print( "How many players will play? " );
        Scanner scanner = new Scanner( System.in );
        int playersQuantity = scanner.nextInt();
        int counter = 0;

        Giver[] playersList = new Giver[ playersQuantity ];
        ArrayList<Giver> playersTakenList

        for( int i = 0; i < playersQuantity; i++ ) {
            System.out.print( "Type the players " + ( i + 1 ) + " name: " );
            String playerName = scanner.next();
            Giver currentGiver = new Giver();
            currentGiver.setName( playerName );
            playersList[ i ] = currentGiver;
            // currentGiver.toString();
        }

        System.out.println( Arrays.toString( playersList ) );

    }
}
