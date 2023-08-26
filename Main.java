import java.util.Scanner;
import java.util.Random;
class Main{
   
    public static void main(String[] args) {
        Scanner reader =  new Scanner(System.in);
        String play = "yes";
        //while loop to determine going to play game
        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(100 );
            int guess = -1;
            int tries = 0;

            //loop to check game is over
            while(guess != randNum)
            {
                System.out.println("Guess a number between 1 and 100:");
                guess = reader.nextInt();
                tries++;

                if(guess == randNum)
                {
                    System.out.println(" Yes...Excellent!! You guessed the number!");
                    System.out.println("You made it in "+ tries + "guessess!");
                    System.out.print("Would you like to play again? yes or No: ");
                    
                    play = reader.next().toLowerCase();
                    
                }
                else if(guess > randNum)
                {
                    System.out.println("Your guess is too high, try again.");
                }
                else
                {
                    System.out.println("Your guess is too low,try again.");
                }
            }
        }
        System.out.println("Okkk see you again....!");
        reader.close();
    }
}
