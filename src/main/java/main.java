/* this imports in the ability to use a scanner and a random number 
generator*/
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author levi.thompson
 */
public class main {
    /* this is the main method where the bulk of code would be*/
    public static void main(String[] args) {
        /* line 19 creates a random number generator and line 20 creates 
        a scanner*/
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        /* creates and array that holds the different meal names*/
        String[] meal = {"shrimp", "tacos", "sushi"};
        /* a variable that uses the random generator but only goes up to 2*/
        int mealIndex = rand.nextInt(3);
        /* this is a variable that holds a meal name based on the index
        made from the random number given by mealIndex*/
        String mealSelected = meal[mealIndex];
        /* lines 30 and 33 print a prompt to the user*/
        System.out.println("The secret meal must be one of the following"
                + "\n" + "shrimp" + "\n" + "tacos" + "\n" + "sushi");

        System.out.print("Guess the secret meal: ");
        /* creates a scanner so that the user can enter a meal name*/
        String userInput = scan.nextLine();
        /* holds the previous answer given by the user*/
        String previousAnswer = "";
        /* allow the user to continue guessing when they get the answer wrong
        while checking for similarities between answers to decide whether or 
        not the user can keep guessing*/
        while (!userInput.equals(mealSelected)) {

            if (!userInput.equals(mealSelected) && 
                    !userInput.equals(previousAnswer)) {
                System.out.println("Wrong");
                previousAnswer = userInput;

            } else if (userInput.equals(previousAnswer)) {
                System.out.println("You already guessed that! Wrong! "
                        + "You lose.");
                break;
            }

            System.out.print("Guess the secret meal: ");
            userInput = scan.nextLine();
        }
        /* the while loop is skipped when the user guesses the meal right, */
        if (userInput.equals(mealSelected)) {
            System.out.println("Correct! You win.");
        }
    }
}
/* time estimated: an hour or more
   time taken: 30-45 minutes*/