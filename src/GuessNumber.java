import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: danielabecker
 * Date: 8/13/14
 * Time: 2:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class GuessNumber {

    private int numb = 10;

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber();
        game.guess();

    }

    public void guess() {
        int guessNumb;
        int count = 0;
        Scanner std = new Scanner(System.in);
        do {

            System.out.println("Guess a number:");
            guessNumb = std.nextInt();
            int guessNumb2 = guessNumb;
            if (guessNumb > numb) {
                System.out.println("<");
                count++;
            } else if (guessNumb < numb) {
                System.out.println(">");
                count++;
            }
        } while (guessNumb != numb);
        System.out.println("YEAH " + count++);
    }
}
