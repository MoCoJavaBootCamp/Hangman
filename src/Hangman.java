import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hangman {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> wordPool = new ArrayList<String>(Arrays.asList("tree", "rain", "bear", "encourage", "promise",
                "soup", "chess", "insurance", "pancakes", "stream"));
        Random random = new Random();
        ArrayList<String> guessedLetters = new ArrayList<String>();
        String selectedWord = wordPool.get(random.nextInt(wordPool.size()));
        int selectedWordLength = selectedWord.length();
        String[] selectedWordSplit = selectedWord.split("");
        String[] splitCopyHint = new String[selectedWordLength];
        int guessesLeft = 6;
        String currentGuess = "";

        // split word into array
        // make copy and replace chars with _
        for (int i = 0; i < selectedWordLength; i +=1) {
            splitCopyHint[i] = "_ ";
        }
        // prompt user for guess
        // check guess is selectedWord or
        // loop over array and check selected word chars
            // if so, replace chars

        System.out.println("Welcome, let's play hangman!");
        System.out.println("Here's the word I'm thinking of: " + selectedWordHint);

        do {
            System.out.printf("Enter a letter to guess the word.\n" +
                    "Guessed letters: %s\n" +
                    "Guesses left: %d\n", guessedLetters, guessesLeft);
                    guessesLeft -= 1;
                    currentGuess = input.nextLine();
                    if (selectedWord.equals(currentGuess)) {
                        System.out.println("You've won! The word was " + selectedWord);
                        System.out.println("Thank you for playing!");
                        System.exit(1);
                    }
        } while (guessesLeft > 0);

        System.out.println("Sorry, you have no more guesses left. The word was " + selectedWord);
    }
}
