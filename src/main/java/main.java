
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

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        String[] meal = {"shrimp", "tacos", "sushi"};

        int mealIndex = rand.nextInt(3);

        String mealSelected = meal[mealIndex];
        
        System.out.println("The secret meal must be one of the following"
                + "\n" + "shrimp" + "\n" + "tacos" + "\n" + "sushi");

        System.out.print("Guess the secret meal: ");

        String userInput = scan.nextLine();

        String previousAnswer = "";

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
        if (userInput.equals(mealSelected)) {
            System.out.println("Correct! You win.");
        }
    }
}
