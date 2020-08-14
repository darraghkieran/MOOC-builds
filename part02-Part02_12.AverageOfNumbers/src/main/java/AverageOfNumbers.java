
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                break;
            } else {
                count++;
                sum = (sum + n);
            }
        }
        System.out.println("Average of the numbers is: " + (sum*1.0 / count));
    }
}
