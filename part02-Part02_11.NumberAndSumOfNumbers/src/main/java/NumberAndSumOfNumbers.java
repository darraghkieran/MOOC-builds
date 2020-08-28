
import java.util.Scanner;

public class NumberAndSumOfNumbers {

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
        System.out.println("Number of the numbers: " + count);
        System.out.println("Sum of the numbers: " + sum);
    }
}
