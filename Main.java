import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what two numbers do you want to play with in multiples? ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("what words would you like to use as 'bizz' and 'buzz'. ");
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println("choose your range of numbers: ");
        System.out.print("from ");
        int starter = scanner.nextInt();
        System.out.print(" to ");
        int endPoint = scanner.nextInt();
        scanner.nextLine();

        HashMap<Integer, String> game = new HashMap<>();
        game.put(number1, word1);
        game.put(number2, word2);

        for (int i = starter; i <= endPoint; i++) {
            var output = "";

            for (int key : game.keySet()) {
                if (i % key == 0) {
                    output += game.get(key);
                }
            }
            if (output.isEmpty()) {
                output = String.valueOf(i);
            }

            System.out.println(output);
        }
    }
}