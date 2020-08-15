
import java.util.Scanner;

public class DoubleInput {

     public static void main(String[] args) {
        Scanner reader = new Scanner (System.in);
        
        System.out.println("Give a number: ");
        double number = Double.valueOf (reader.nextLine());
        System.out.println("You gave the number " + number);
     
    }
}
