
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Last number?");
        int n = Integer.valueOf(scanner.nextLine());
        int x = 0;
        
        for (int i = 1; i <= n; i++){
            x = x + i;
        }
        System.out.println("The sum is " + x);
    }      
}
