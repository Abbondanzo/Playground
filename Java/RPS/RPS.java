import java.util.Scanner;
import java.util.Random;

public class RPS {
    public static int winner(int user, int cp) {
        if (user == 3) {
            return -1;
        } else if ((user > cp) || (user == 0 && cp == 2)) {
            return 1;
        } else if ((cp > user) || (cp == 0 && user == 2)) {
            return 0;
        } else if (user == cp) {
            return 2;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Rock, paper, or scissors:");
        String input = scanner.nextLine();
        input = input.toLowerCase();

        int i = 0;
        switch(input) {
            case "rock":
                i = 0;
                break;
            case "paper":
                i = 1;
                break;
            case "scissors":
                i = 2;
                break;
            default:
                i = 3;
                System.out.println("NOT RIGHT. GO AWAY OR TRY AGAIN");
                return;
        }

        int cp = random.nextInt(3);
        int results = winner(i, cp);

        String output = "";
        switch(results) {
            case 0:
                output = "You lost. Ha.";
                break;
            case 1:
                output = "You beat a computer. Congrats, I guess.";
                break;
            case 2:
                output = "Meh. Tied.";
                break;
            default:
                output = "Leave me alone";
                break;
        }

        System.out.println(output);
    }
}
