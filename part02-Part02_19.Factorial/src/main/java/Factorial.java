
import java.util.Scanner;

public class Factorial{
    
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give a number");
        int n = Integer.valueOf(scan.nextLine());
        int f = 1;
        
        for (int i = 1; i <= n; i++){
            f *= i;   
        }
        
        System.out.println("Factorial: " + f);
                   
    }
}
