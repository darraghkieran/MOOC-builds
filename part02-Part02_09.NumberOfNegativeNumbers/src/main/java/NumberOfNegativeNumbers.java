
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        int x = 0;
        while(true){
            System.out.println("Give a number: ");
            int n = Integer.valueOf(scanner.nextLine());
            
            if (n == 0){
                break;
            } else if (n < 1){
                x++;
            }  
            else {
                continue;
            }
        }  
        System.out.println ("Number of Negative Numbers: " + x); 
    }
}
