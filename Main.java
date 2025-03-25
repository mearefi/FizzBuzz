import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What two numbers do you want to play with in multiples? ");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("what words would you like to use as 'bizz' and 'buzz'. ");

        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();

        System.out.println("choose your range of numbers. ");

        System.out.print("from ");
        int starter = scanner.nextInt();
        System.out.print(" to ");
        int endPoint = scanner.nextInt();
        System.out.println(" is your range");

        for (int i = starter; i <= endPoint; i++) {
            var output = "";

            if (i % number1 == 0) output += word1;
            if (i % number2 == 0) output += word2;
            if (output.isEmpty()) output += i;

            System.out.println(output);

        }
    }
}
