
import java.util.Scanner;

public class RepeatingBreakingAndRemembering{
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        int sum = 0; int number = 0; int even = 0; int odd = 0;
        
        System.out.println("Give numbers: ");

        while (true){
            int x = Integer.valueOf(scan.nextLine());
            
            if (x == -1){
                break;
            }else if (x != -1 && x % 2 == 0){
                sum += x;
                number++;
                even++;    
            }else{
                sum += x;
                number++; 
                odd++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + number);
        System.out.println("Average " + (sum*1.0 / number));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd); 
        System.out.println("Tnx! Bye!");
    }
}



        
       
       