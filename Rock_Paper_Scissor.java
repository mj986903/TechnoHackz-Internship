import java.util.Scanner;
import java.util.Random;

class Rock_Paper_Scissor {
    public static void main(String[] args) {

        int n = 0, c = 0, u = 0;
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("**** RULE FOR THIS GAME ****");
        System.out.println("1.Rock\n2.Paper\n3.Scissor\n4.Exit\n");

        while (true) {

            System.out.print("User:- ");
            int input = sc.nextInt();

            if (input == 4) {
                break;
            }

            int random = 0;
            while (true) {
                random = r.nextInt(4);
                if (random != 0) {
                    break;
                }
            }
            System.out.println("Computer :- " + random);

            switch (input) {
                case 1:
                    if (random == 1) {
                        System.out.println("Tie!\n");
                        break;
                    } else if (random == 2) {
                        System.out.println("Computer Win!\n");
                        break;
                    } else if (random == 3) {
                        System.out.println("You Win!\n");
                        break;
                    }
                case 2:
                    if (random == 1) {
                        System.out.println("You Win!\n");
                        break;
                    } else if (random == 2) {
                        System.out.println("Tie!\n");
                        break;
                    } else if (random == 3) {
                        System.out.println("Computer Win!\n");
                        break;
                    }
                case 3:
                    if (random == 1) {
                        System.out.println("Computer Win!\n");
                        break;
                    } else if (random == 2) {
                        System.out.println("You Win!\n");
                        break;
                    } else if (random == 3) {
                        System.out.println("Tie!\n");
                        break;
                    }
            }
        }
    }
}