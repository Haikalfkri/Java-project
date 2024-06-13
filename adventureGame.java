import java.util.Scanner;
/**
 * adventureGame
 */
public class adventureGame {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to adventure game");

        System.out.println("Story 1:");

        System.out.println("Right now, you are in the middle of jungle, you lost, you dont know where to go, and you keep walking forward, and see 2 bridge, right bridge and left bridge.");

        boolean isPlay = true;

        while (isPlay) {
            System.out.print("Which bridge you choose? (right/left): ");
            String bridge = scanner.nextLine().toLowerCase();

            if (bridge.equals("right")) {
                System.out.println("You success walk through the bridge");
                System.out.println("Story 2:");
                System.out.println("After walk through the bridge, you met 3 doors, door number 1 have a lion does'nt eat for 3 years, door number 2 have a giant snack with deadly poison, and door number 3 have a sleep giganting crocodile");

                System.out.print("Which one door you choose (1, 2, 3): ");
                String door = scanner.nextLine();

                if (door.equals("1")) {
                    System.out.println("Congratulation, you success walk through the door, because the lion alread die.");
                    System.out.println("You win");
                    isPlay = false;
                } else if (door.equals("2")) {
                    System.out.println("You got bite by the snack, and you die");
                    System.out.println("You lose");
                    isPlay = false;
                } else if (door.equals("3")) {
                    System.out.println("You accidentally stepped on a tree branch and woke up the crocodile, you were eaten by him, and you die");
                    System.out.println("You lose");
                    isPlay = false;
                } else {
                    System.out.println("Invalid input");
                }

            } else if (bridge.equals("left")) {
                System.out.println("the bridge is broken, you fell, and you die");
                isPlay = false;
            } else {
                System.out.println("Invalid answer. Try again!");
                continue;
            }
            scanner.close();
        }

        System.out.println("Thanks for playing the game!");
    }
}