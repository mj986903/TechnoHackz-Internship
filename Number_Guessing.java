import java.util.Random;
import java.util.Scanner;

class Game {
    public int random;
    public int input;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random r = new Random();
        random = r.nextInt(100);
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess Number: ");
        input = sc.nextInt();
    }

    public boolean isCorrectNumber() {
        noOfGuesses++;
        if (input > random) {
            System.out.println("Guess Number Is Large!\n");
        } else if (input < random) {
            System.out.println("Guess Number Is Short!\n");
        } else if (input == random) {
            System.out.println("Winner!!!");
            System.out.println("\nAttempts" + noOfGuesses);
            return true;
        }
        return false;
    }
}

class Number_Guessing {
    public static void main(String[] args) {
        Game g1 = new Game();
        boolean b = false;
        while (!b) {
            g1.takeUserInput();
            b = g1.isCorrectNumber();
        }
    }
}