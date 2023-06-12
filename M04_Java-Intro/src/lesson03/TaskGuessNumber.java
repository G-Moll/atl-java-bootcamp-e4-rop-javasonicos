import java.util.Scanner;
import java.util.Random;

public class TaskGuessNumber {
    /*
    5) Juego de adivinar el número:
    Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.

    public TaskGuessNumber(){
    }
    */

    public static void main(String[] args){
        Random randomGenerator = new Random();
        Integer randomNumber;
        Integer minNumber = 1;
        Integer maxNumber = 100;
        Integer userGuessNumber;
        Scanner scanner = new Scanner( System.in );

        do {
            randomNumber =  randomGenerator.nextInt( 101 );
        }
        while( randomNumber <= 0 );

        System.out.println( randomNumber );

        System.out.println( "Type a integer number, trying to guess a random number: " );
        userGuessNumber = scanner.nextInt();

        if( userGuessNumber == randomNumber ) {
            System.out.println( "Congratulations, you've guessed the random number: " + randomNumber );
        }
        else {
            System.out.println( "Opps, you've not guessed the random number: " + randomNumber );
            System.out.println( "The Random is: " + randomNumber );
        }
    }
}

/*
FAILED TRYES
Integer randomNumber =  Integer.parseInt( ( Math.random() * ( maxNumber - minNumber + 1 ) + minNumber ) );
Integer randomNumber =  Integer.intValue( Math.floor(Math.random() * (maxNumber - minNumber + 1 ) + minNumber ) );
int random_int = (int)Math.floor(Math.random() * (maxNumber - minNumber + 1) + minNumber);
*/
