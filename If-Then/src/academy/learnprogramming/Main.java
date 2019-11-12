// A lesson on if-then statements and operators

package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        System.out.println("It is not an alien!");
        System.out.println("And I am scared of aliens!");

        /* practice with if statements */
        int topScore = 100;
        if(topScore == 100) { // practice with code blocks
            System.out.println("You got the high score!");
        }

        /* practice with the AND operator */
        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) { // && makes sure both have to be set to the same boolean
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true.");
        }
    }

}
