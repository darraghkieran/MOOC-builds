
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What's your name?");
        String answer = reader.nextLine();
        System.out.println("Hi " + answer);
    }
}
