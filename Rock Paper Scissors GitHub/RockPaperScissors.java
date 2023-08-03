import javax.swing.JOptionPane;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        // Define the options for Rock, Paper, and Scissors
        String[] options = { "Rock", "Paper", "Scissors" };

        // Prompt the user to select an option
        int userChoice = JOptionPane.showOptionDialog(null, "Select your option:", "Rock Paper Scissors",
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

        // Generate a random choice for the computer
        Random random = new Random();
        int computerChoice = random.nextInt(3); // Generates a random integer between 0 and 2

        // Determine the result of the game
        String result = "";
        if (userChoice == computerChoice) {
            result = "Draw!";
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            result = "You win!";
        } else {
            result = "You lose!";
        }

        // Display the chosen options and the result
        String userChoiceText = options[userChoice];
        String computerChoiceText = options[computerChoice];
        String message = "You chose " + userChoiceText + ", the Computer chose " + computerChoiceText + "\n" + result;
        JOptionPane.showMessageDialog(null, message);
    }
}
